package autoation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class setsize {
	public static void main(String[] args) throws InterruptedException {
		String expUrl="https://www.selenium.dev/downloads/";
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe" );
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		WebDriver driver = new ChromeDriver(opt);
		// 4. maximize()
				driver.manage().window().maximize();

				// 1. get() - to open url
				driver.get("https://www.selenium.dev/downloads/");
				
				Thread.sleep(2000);
				
				Dimension d = new Dimension(500, 800);//width - 500, height - 800
				driver.manage().window().setSize(d);
				
				Thread.sleep(2000);
				
				driver.quit();
				

	}

}
