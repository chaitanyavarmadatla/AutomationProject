package SeliniumAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {
                
                
     static WebDriver driver;
     
                public static void main(String[] args) throws InterruptedException {
                                // TODO Auto-generated method stub
                                
                                //System.setProperty(“propertyName”, “value”)” 
                                System.setProperty("webdriver.chrome.driver", "E:\\Java\\chromedriver.exe");
                                driver=new ChromeDriver();
                                driver.get("http://automationpractice.com");
                                //driver.findElement(By.linkText("Women"));
                                driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]")).click();
                                ////div[@id="center_column"]/ul/li/div/div/h5/a[@title="Faded Short Sleeve T-shirts"]
                                //driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div/h5/a[@title='Faded Short Sleeve T-shirts']")).click();
                    //driver.findElement(By.xpath("//input[@id='quantity_wanted']")).click();
                                driver.findElement(By.xpath("//div[@id='center_column']/ul/li/div/div/div/a[@title='Faded Short Sleeve T-shirts']")).click();
                                driver.findElement(By.name("qty")).clear();
                                driver.findElement(By.name("qty")).sendKeys("3");
                                ////div[@id="uniform-group_1"]
                                //driver.findElement(By.xpath("//[@id='accordion']/div[2]/div[1]/h4/a")).click();
                                driver.findElement(By.xpath("//div[@id='uniform-group_1']")).click();
                                new Select(driver.findElement(By.name("group_1"))).selectByVisibleText("M");
                                driver.findElement(By.xpath("//li/a[@name='Blue']")).click();
                                driver.findElement(By.xpath("//div/p[@id='add_to_cart']")).click();
                                //driver.close();
                                //driver.findElement(By.id("button-cart")).click();
                    
                             
                                

                }

}
