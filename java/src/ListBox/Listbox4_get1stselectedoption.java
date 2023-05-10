package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Listbox4_get1stselectedoption {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByVisibleText("20");
		System.out.println(s.getFirstSelectedOption().getText());
        List<WebElement> allOptions = s.getAllSelectedOptions();
		for(WebElement opt1:allOptions)
		{
			System.out.println(opt1.getText());
		}
			Thread.sleep(2000);
			driver.quit();
		
	}

}
