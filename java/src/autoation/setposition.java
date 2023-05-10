package autoation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class setposition {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	//driver.manage().window().maximize();

	driver.get("https://www.selenium.dev/downloads/");
	//driver.manage().window().minimize();
	
	Thread.sleep(2000);
	Point p = new Point(1200, 2700);
	driver.manage().window().setPosition(p);

	 driver.close();
}
}