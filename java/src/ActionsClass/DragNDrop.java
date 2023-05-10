package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
	    WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement dest = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
	    Actions act=new Actions(driver);
	    //act.clickAndHold(src).moveToElement(dest).release().build().perform();
	    act.dragAndDrop(src, dest).perform();
	    Thread.sleep(2000);
	    driver.quit();
	    
	    
}
}