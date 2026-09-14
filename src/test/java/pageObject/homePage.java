package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement clickRegister;

    public registrationPage clickRegister() {

        clickRegister.click();

        return new registrationPage(driver);
    }
}
