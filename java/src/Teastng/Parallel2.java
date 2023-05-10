package Teastng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test
	public void TC2() throws InterruptedException
	{
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
