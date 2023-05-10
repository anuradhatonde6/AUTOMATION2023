package POPUPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowser_popups1
{
	public static void main(String[] args) throws InterruptedException
	 {
		 System.setProperty("WebDriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions opt =new ChromeOptions();
		 opt.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(opt);
		 driver.manage().window().maximize();
		 driver.get("https://skpatro.github.io/demo/links/");
		 Thread.sleep(2000);
		 String IdOfMainPage = driver.getWindowHandle();
		 System.out.println(IdOfMainPage);
		 driver.findElement(By.xpath(IdOfMainPage));
	
	 }
	
}