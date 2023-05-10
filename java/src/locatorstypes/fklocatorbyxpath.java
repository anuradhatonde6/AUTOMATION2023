package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fklocatorbyxpath {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*"); 
	WebDriver driver=new ChromeDriver(opt);    
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
	Thread.sleep(1000);
	driver.close();
	}
}
