package Pages;

import org.openqa.selenium.support.PageFactory;

import common.Configuration;

public class PimPage extends Configuration {
	
	public HomePage navigateBack()
	{
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		return new HomePage();
	}
	
	public PimPage()
	{
		PageFactory.initElements(driver, this);
	}

}


