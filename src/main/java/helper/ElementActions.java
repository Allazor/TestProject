package helper;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

public class ElementActions {
    public ElementActions click(SelenideElement element) {
        element.shouldBe(Condition.visible).click();
        return this;
    }

    public ElementActions writeText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).sendKeys(text);
        return this;
    }

    public ElementActions navigateToElement(SelenideElement element) {
        element.hover();
        WaiterManager.pause(4);
        return this;
    }

    public String getTextFromElement(SelenideElement element){
        return element.getText();
    }

    public ElementActions pressEnter(){
        Selenide.actions().sendKeys(Keys.ENTER).perform();
        return this;
    }


}
