package SeliniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("file:///E:/Java/sample.html");
		    String currentBrowser=driver.getWindowHandle();
		    String newBrowser="";
		    
		    driver.findElement(By.linkText("Yahoo")).click();
		    Set<String> allBrowser = driver.getWindowHandles();
		    System.out.println("current title: "+driver.getTitle());
		    //Iterate over set
		    
		    for(String s: allBrowser)
		    {
		    	if(!s.equals(currentBrowser))
		    	{
		    		newBrowser = s;
		    		break;
		    	}
		    }
         
		    driver.switchTo().window(newBrowser);
		    System.out.println("new title: "+driver.getTitle());
		    driver.switchTo().window(currentBrowser);
	}

}
