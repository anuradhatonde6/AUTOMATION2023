package Teastng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MultibroswerTesting {
	
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		if(browserName.equals("Chrome"))
		{
			System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(opt);
		}else if(browserName.equals("edge"))
		{

			System.setProperty("Webdriver.edge.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browserName.equals("Firefox"))
		{

			System.setProperty("Webdriver.gecko.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{

			System.setProperty("Webdriver.ie.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
