package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 
	 @FindBy(xpath="//input[@data-qa='login-email']")
	    WebElement txtEmailAddress;

	    @FindBy(xpath="//input[@data-qa='login-password']")
	    WebElement txtPassword;

	    @FindBy(xpath="//button[@data-qa='login-button']")
	    WebElement btnLogin;
	    
	    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
	    WebElement loginText;

	    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
	    WebElement loginError;

	    public void setEmail(String email) {
	        txtEmailAddress.sendKeys(email);
	    }

	    public void setPassword(String pwd) {
	        txtPassword.sendKeys(pwd);
	    }

	    public void ClickLogin() {
	        btnLogin.click();
	
	
	    }
	    
	    public boolean isLoginPageDisplayed() {
	        return loginText.isDisplayed();
	    }

	    public boolean isLoginErrorDisplayed() {
	        return loginError.isDisplayed();
	

}

}