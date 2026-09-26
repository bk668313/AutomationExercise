package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CartPage;
import pageObject.ProductPage;
import pageObject.homePage;
import testBase.BaseClass;

public class TC02_AddtoCart extends BaseClass {
	
	
	 @Test(groups = {"Regression"})
	    public void verifyWomenProductAddToCart() {

	     logger.info("Starting Women Add To Cart Test");
	     
	     homePage hp = new homePage(driver);

	     ProductPage pp = new ProductPage(driver);

	     CartPage cp = new CartPage(driver);
	     
	     hp.clickProducts();

	    logger.info("Clicked Products");
	    
	    hp.clickWomenCategory();

        logger.info("Clicked Women category");
        
        hp.clickWomenTops();

        logger.info("Clicked Tops");
        
        Assert.assertTrue(pp.isWomenTopsDisplayed(),"Women Tops page is not displayed" );

        logger.info("Women Tops page verified");
        
        pp.clickFirstProductAddToCart();

        logger.info("First product added to cart");
        
        pp.clickViewCart();

        logger.info("Clicked View Cart");
        
        
        Assert.assertTrue(cp.isShoppingCartDisplayed(), "Shopping Cart page is not displayed" );

        logger.info("Shopping Cart page verified");
        
        Assert.assertTrue(cp.isProductDisplayed(), "Product is not displayed in cart" );

        logger.info("Product verified in cart");

        
        Assert.assertEquals( cp.getQuantity(), "1", "Product quantity is not 1" );

        logger.info("Product quantity verified as 1");
        
        System.out.println("Product added to cart: " + cp.getProductName());

        System.out.println("Product quantity: " + cp.getQuantity() );


        logger.info("Women Add To Cart Test completed successfully");
    }
}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	
	
	



