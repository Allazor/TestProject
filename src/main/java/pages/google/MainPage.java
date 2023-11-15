package pages.google;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helper.WaiterManager;
import org.openqa.selenium.By;
import pages.BasePage;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage extends BasePage {
    private static final SelenideElement searchInput = $(By.xpath("//div//textarea[@id]"));
    private static final ElementsCollection listOfNames = $$(By.xpath("//div/ul/li[@role=\"presentation\"]"));
    private static final SelenideElement tooltipSearch = $(By.xpath("//div//textarea[@title]"));


    public MainPage writeTextOnSearchField(String text) {
        actions.writeText(searchInput, text);
        WaiterManager.pause(3);
        return this;
    }

    public MainPage writeTextAndPressEnter(String text) {
        actions.writeText(searchInput, text).pressEnter();
        return this;
    }

    public List<String> getNames(){
        return listOfNames.texts();
    }

    public boolean  checkVisibleText(){
        actions.navigateToElement(searchInput);
        return tooltipSearch.isDisplayed();
    }

    public String getSearchInputText(){
        return searchInput.shouldBe(Condition.visible).getText();
    }


}
