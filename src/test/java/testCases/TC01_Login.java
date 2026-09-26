package testCases;

import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC01_Login extends BaseClass{
	
	
	
	@Test(groups="Sanity")
    public void testLogin() {

		
		homePage hp=new homePage(driver);
		hp.clickSignupLogin();	
		
		
        LoginPage lp = new LoginPage(driver);

        lp.setEmail(p.getProperty("Email"));
        lp.setPassword(p.getProperty("Password"));
        lp.ClickLogin();
    }
	
	
	
	// TC002 - Invalid Password
	@Test(priority = 2, groups = "Regression")
    public void testInvalidPassword() {

        LoginPage lp = new LoginPage(driver);

        lp.setEmail(p.getProperty("Email"));
        lp.setPassword("Wrong@123");
        lp.ClickLogin();

}
}