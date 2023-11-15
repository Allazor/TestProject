package uiTests.google;


import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseTest;


public class GoogleTest extends BaseTest {

    @Test(groups = "Ui")
    public void testForSearchByName() {
        String name = data.generateName();
        mainPage.writeTextOnSearchField(name);
        mainPage.getNames().forEach(s ->{
            Assert.assertTrue(s.toLowerCase().contains(name.toLowerCase()));
        });
    }

    @Test(groups = "Ui")
    public void testForSearchByFullName() {
        String fullName = readFileExample.getCelebrityName();
        mainPage.writeTextOnSearchField(fullName);
        mainPage.getNames().forEach(s ->{
            Assert.assertTrue(s.toLowerCase().contains(fullName.toLowerCase()));
        });

    }

    @Test(groups = "Ui")
    public void checkSearchInput() {
        String name = data.generateName();
        mainPage.writeTextAndPressEnter(name);
        searchResultPage.clickGoogleIcon();
        Assert.assertEquals(mainPage.getSearchInputText(), "");
    }
}
