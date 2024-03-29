package SeliniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://the-internet.herokuapp.com/nested_frames");
		    
		    //frame identification if name is not given
		    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		    
		    //frame identification if name is given
		    driver.switchTo().frame("frame-middle");
		    String sData=driver.findElement(By.id("content")).getText();
		    System.out.println(sData);
		    
		    //To Move to Another Frame
		    //driver.switchTo().defaultContent();
		    //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		    //driver.switchTo().frame("frame-right");
		  
		    
		    
		   
	
	}

}
