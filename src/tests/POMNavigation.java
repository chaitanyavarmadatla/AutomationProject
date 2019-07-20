package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AdminPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.PimPage;
import common.Configuration;


public class POMNavigation extends Configuration {
	
	 LoginPage objLogin;
	 HomePage  objHome;
	 AdminPage objAdmin;
	 PimPage   objPim;
	 
	@BeforeTest
	public void Login()
	{
		 objLogin=new LoginPage();
	     objHome=objLogin.login("admin", "admin123");	
	}
	  
 	
  @Test
  public void verifyAdminFunctionality() {
	  
	   
	 //objHome= new HomePage();
	 objHome.verifyHomePage();
	 objAdmin=objHome.navigateToAdminPage();
	 objHome=objAdmin.navigateBack();
	  
  }
  
  @Test
  public void verifyPimFunctionality() {
	  
	   
	 //objHome= new HomePage();
	 objHome.navigateToPIMPage();
	 objHome=objPim.navigateBack();
	
	  }
  
  
  
}
