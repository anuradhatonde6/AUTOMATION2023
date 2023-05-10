package locatorstypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class xpath {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		WebDriver driver=new ChromeDriver(opt);    
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("qa@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("12345");
	    Thread.sleep(1000);
	   // driver.findElement(By.xpath("//button[text()='Log in']")).click();
	   // Thread.sleep(1000);
	    //driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
	    //Thread.sleep(1000);
	   driver.findElement(By.xpath("(//a[contains(text(),'Create')][1])")).click();
	   Thread.sleep(2000);
	    driver.close();
	  
	}
}
	
