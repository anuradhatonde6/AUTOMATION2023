package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssselecter {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*"); 
	WebDriver driver=new ChromeDriver(opt);    
	driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("qa@123.com");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234567890");
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("button[value='1']")).click();
    Thread.sleep(1000);
    driver.close();
}
}
