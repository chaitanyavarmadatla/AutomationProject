package SeliniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    

	}

}
