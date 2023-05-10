package ActionsClass;

import org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		Actions act=new Actions(driver);
		//act.moveToElement(more).perform();
		//act.contextClick(more).perform();
		act.click(more).perform();
		Thread.sleep(2000);
		driver.quit();
	
		
		
		
		
		
	}

}
