package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
	WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    
    @FindBy(xpath = "//li[contains(text(),'Shopping Cart')]")
    WebElement shoppingCart;
    
    @FindBy(xpath = "//td[@class='cart_description']//a")
    WebElement productInCart;
    
    @FindBy(xpath = "//td[@class='cart_quantity']//button")
    WebElement productQuantity;
    
    
    
    public boolean isShoppingCartDisplayed() {

        return shoppingCart.isDisplayed();
    }


    public boolean isProductDisplayed() {

        return productInCart.isDisplayed();
    }


    public String getProductName() {

        return productInCart.getText();
    }
    
    public String getQuantity() {

        return productQuantity.getText();
    }
}
    
    
    
    

