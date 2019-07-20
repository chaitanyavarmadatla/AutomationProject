package SeliniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("file:///E:/Java/sample.html");
		    driver.findElement(By.id("button1")).click();
		    driver.switchTo().alert().accept();
		    driver.findElement(By.id("username")).sendKeys("test");
	}

}
