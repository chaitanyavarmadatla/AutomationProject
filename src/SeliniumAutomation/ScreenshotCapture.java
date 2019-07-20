package SeliniumAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("E:/Java/Test.png"));
	}

}
