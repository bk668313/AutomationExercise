package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Signup / Login')]")
    WebElement signupLogin;

    @FindBy(xpath = "//a[contains(text(),'Logged in as')]")
    WebElement loggedInUser;
    
    @FindBy(xpath = "//a[@href='/products']")
    WebElement products;
    
    @FindBy(xpath = "//a[@href='#Women']")
    WebElement womenCategory;
    
    
    @FindBy(xpath = "//a[@href='/category_products/2']")
    WebElement womenTops;

    @FindBy(xpath = "//a[@href='#Men']")
    WebElement menCategory;
    
    @FindBy(xpath = "//a[@href='/category_products/6']") 
    WebElement menJeans;
   

    // Click Signup / Login
    public void clickSignupLogin() {
        signupLogin.click();
    }

    // Verify user is logged in
    public boolean isLoggedIn() {
        return loggedInUser.isDisplayed();
    }
    public void clickProducts()
    { 
    	products.click(); 
    }
    
   
    
    public void clickWomenCategory() {
    	
    	((org.openqa.selenium.JavascriptExecutor) driver) 
    	.executeScript("arguments[0].scrollIntoView({block: 'center'});", womenCategory);
    	
    	((org.openqa.selenium.JavascriptExecutor) driver).executeScript( "arguments[0].click();",womenCategory);
    }
    
   
    
    public void clickWomenTops()
    {
    	womenTops.click();
    }
    
    public void clickMenCategory()
    { 
    	menCategory.click(); 
    }
    
    public void clickMenJeans()
    {
    	menJeans.click();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
}