package autoation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class navigate {
	public static void main(String[] args) throws InterruptedException {
		String expUrl = "https://www.selenium.dev/downloads/";
		// sets the browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(opt);
     // 4. maximize()
     		driver.manage().window().maximize();

     		//driver.get("https://www.selenium.dev/downloads/");
     		driver.navigate().to("https://www.selenium.dev/downloads/");
     		
     		Thread.sleep(1000);
     		
     		driver.navigate().to("https://www.facebook.com/");
     		
     		driver.navigate().back();//selenium
     		
     		driver.navigate().forward();//facebook;
     		
     		driver.navigate().refresh();
     		
     		Thread.sleep(2000);
     		driver.quit();

	}

}
