package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    
    @FindBy(xpath = "//h2[contains(text(),'Women - Tops Products')]")
    WebElement womenTopsHeading;
    
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[1]")
    WebElement firstProductAddToCart;
    
    @FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")
    WebElement continueShopping;
    
    @FindBy(xpath = "//u[text()='View Cart']")
    WebElement viewCart;
    
    
    
    public boolean isWomenTopsDisplayed() {

        return womenTopsHeading.isDisplayed();
    }


    public void clickFirstProductAddToCart() {

        firstProductAddToCart.click();
    }


    public void clickContinueShopping() {

        continueShopping.click();
    }

    public void clickViewCart() {

        viewCart.click();
    }
    
    
    
    
    
    
    
}
