package pages.google;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage extends BasePage {

    private static final SelenideElement googleIcon = $(By.xpath("//div[@class='logo']/a[@href]/img"));

    public MainPage clickGoogleIcon() {
        actions.click(googleIcon);
        return new MainPage();
    }


}
