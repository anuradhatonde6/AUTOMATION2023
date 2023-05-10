package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		WebDriver driver=new ChromeDriver(opt);    
		driver.manage().window().maximize();
        driver.get("C:\\Users\\Anuradha\\Documents\\html\\loginform.html");
        Thread.sleep(1000);
        driver.findElement(By.tagName("input")).sendKeys("qa@gmail.com");  
		Thread.sleep(1000);
		driver.findElement(By.id("12345")).sendKeys("1234567");
		Thread.sleep(1000);
		driver.findElement(By.name("abc")).sendKeys("qa@123.com");
		Thread.sleep(1000);
		driver.findElement(By.className("class123")).sendKeys("12345679");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Link1")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Li")).click();
		driver.close();
		

	}

}
