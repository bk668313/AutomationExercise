package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.registrationPage;
import testBase.BaseClass;

public class TC01_Registration extends BaseClass{
	
	
	@Test(groups="Sanity")
    public void accountRegistrationTest() {
		
		logger.info("*** Starting TC01_Registration **********");

        homePage hp = new homePage(driver);

        registrationPage rp = hp.clickRegister();

        rp.enterFirstName("John");
        rp.enterLastName("Smith");
        rp.enterAddress("MG Road");
        rp.enterCity("Bangalore");
        rp.enterState("Karnataka");
        rp.enterZipCode("560001");
     // Generate unique phone number
        String phone = randomNumber();
        rp.enterPhoneNumber(phone);

        rp.enterSSN("123456789");

        // Generate unique username
        String username = "john" + randomString();
        rp.enterUsername(username);

        rp.enterPassword("Test@123");
        rp.enterConfirmPassword("Test@123");

        rp.clickRegister();
        
        
        String actualMessage = rp.getSuccessMessage();

        String expectedMessage =
                "Your account was created successfully. You are now logged in.";

        Assert.assertEquals(actualMessage, expectedMessage);

        logger.info("*** TC01_Registration close **********");
    
        
        

        
        
        
    }
	
	
	
	
	
	

}
