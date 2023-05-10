package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class cutomized_Listbox3 {

	public static void main(String[] args) throws InterruptedException {
		 String expResult = "1";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Create ')])[1]")).click();
		Thread.sleep(4000);
		WebElement day = driver.findElement(By.xpath("(//select[@id='day'])[1]"));
		Actions act=new Actions(driver);
		act.click(day).perform();
	    List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
	    int listBoxSize = allOptions.size();
	    for(int i=0;i<=listBoxSize-1;i++)
	    {
	    	String actResult = allOptions.get(i).getText();	   
	    	System.out.println(actResult);
	    	System.out.println(expResult);
	    	if(actResult.equals(expResult))
	    	{
	    		allOptions.get(i).click();
	    		break;
	    
	    	}
	    	
	    	
	    }
	        Thread.sleep(2000);
	    	driver.quit();
	    	
	    
		  
		
	}
}
