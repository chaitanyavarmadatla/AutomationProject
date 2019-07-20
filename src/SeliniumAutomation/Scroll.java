package SeliniumAutomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Scroll By + for Top to Bottom and Left to Right and - for Right to Left and Bottom to Top
		js.executeScript("window.scrollBy(0,1000)","");
		

	}

}
