package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable_2_print_table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Anuradha\\Documents\\html\\webtable.html");
		Thread.sleep(2000);
		int rowSize=driver.findElements(By.xpath("//table[@class='12345']//tr")).size();
		for(int i=1;i<rowSize;i++)
		{
			int colSize=0;
			if(i==1)
			{
				colSize=driver.findElements(By.xpath("//table[@class='12345']//tr")).size();
			}
		for(int j=1;j<colSize;j++)
		{
			
		}
		}
			
			
	
			}

}
