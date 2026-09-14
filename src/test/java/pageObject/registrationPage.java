package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage extends basePage {
	
	
	public registrationPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	@FindBy(id="customer.firstName")
	WebElement txtFirstName;
	
	// Last Name
    @FindBy(id = "customer.lastName")
    WebElement txtLastName;

    // Address
    @FindBy(id = "customer.address.street")
    WebElement txtAddress;

    // City
    @FindBy(id = "customer.address.city")
    WebElement txtCity;

    // State
    @FindBy(id = "customer.address.state")
    WebElement txtState;

    // Zip Code
    @FindBy(id = "customer.address.zipCode")
    WebElement txtZipCode;

    // Phone Number
    @FindBy(id = "customer.phoneNumber")
    WebElement txtPhoneNumber;

    // SSN
    @FindBy(id = "customer.ssn")
    WebElement txtSSN;

    // Username
    @FindBy(id = "customer.username")
    WebElement txtUsername;

    // Password
    @FindBy(id = "customer.password")
    WebElement txtPassword;

    // Confirm Password
    @FindBy(id = "repeatedPassword")
    WebElement txtConfirmPassword;

    // Register button
    @FindBy(xpath = "//input[@value='Register']")
    WebElement btnRegister;
    
    
    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully')]")
    WebElement successMessage;


    //method
    
    public void enterFirstName(String firstname)
    {
    	txtFirstName.sendKeys(firstname);
    }
    
    public void enterLastName(String lastName) {
        txtLastName.sendKeys(lastName);
    }

    public void enterAddress(String address) {
        txtAddress.sendKeys(address);
    }

    public void enterCity(String city) {
        txtCity.sendKeys(city);
    }

    public void enterState(String state) {
        txtState.sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        txtZipCode.sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        txtPhoneNumber.sendKeys(phoneNumber);
    }

    public void enterSSN(String ssn) {
        txtSSN.sendKeys(ssn);
    }

    public void enterUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickRegister() {
        btnRegister.click();
    }
    
    public String getSuccessMessage() {
        return successMessage.getText();
    }

    
	
}
