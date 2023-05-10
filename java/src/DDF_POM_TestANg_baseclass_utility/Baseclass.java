package DDF_POM_TestANg_baseclass_utility;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	static WebDriver driver;
	public static void openBrowser() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("--disable notifications");	
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to(Utility.getPropertyFileData("url"));
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE,)]")));
		Wait<WebDriver>wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class).pollingEvery(Duration.ofSeconds(5));
		}
}