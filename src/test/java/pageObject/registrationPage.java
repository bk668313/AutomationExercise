package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement email;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement signupButton;

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement maleRadio;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement days;

    @FindBy(xpath = "//select[@id='months']")
    WebElement months;

    @FindBy(xpath = "//select[@id='years']")
    WebElement years;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement address;

    @FindBy(xpath = "//input[@id='state']")
    WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumber;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccount;
    
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;

    public void enterName(String value) {
        name.sendKeys(value);
    }

    public void enterEmail(String value) {
        email.sendKeys(value);
    }

    public void clickSignup() {
        signupButton.click();
    }

    public void selectMale() {
        maleRadio.click();
    }

    public void enterPassword(String value) {
        password.sendKeys(value);
    }

    public void enterFirstName(String value) {
        firstName.sendKeys(value);
    }

    public void enterLastName(String value) {
        lastName.sendKeys(value);
    }

    public void enterAddress(String value) {
        address.sendKeys(value);
    }

    public void enterState(String value) {
        state.sendKeys(value);
    }

    public void enterCity(String value) {
        city.sendKeys(value);
    }

    public void enterZipcode(String value) {
        zipcode.sendKeys(value);
    }

    public void enterMobileNumber(String value) {
        mobileNumber.sendKeys(value);
    }

    public void clickCreateAccount() {
        createAccount.click();
    }
    
    public void clickContinue() {
        continueButton.click();
    }
    
}