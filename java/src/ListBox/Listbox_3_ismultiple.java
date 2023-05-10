package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Listbox_3_ismultiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
        Thread.sleep(4000);
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select s=new Select(day);
        if(s.isMultiple())
        {
        	System.out.println("List box is multiselectable");
        }
        else
        {
        	System.out.println("List box is single selectable");
        }
        Thread.sleep(2000);
        driver.quit(); 
	}
}


