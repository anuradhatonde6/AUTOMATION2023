package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable1_getrowsize_getcellsize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anuradha\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("C:\\Users\\Anuradha\\Documents\\html\\webtable.html");
	Thread.sleep(2000);
	List<WebElement> allRows=driver.findElements(By.xpath("//table[@class='12345']//tr"));
	int rowSize=allRows.size();
	System.out.println("rowSize");
	int colSize=driver.findElements(By.xpath("//table[@class='12345']//tr[1]//th")).size();
	System.out.println(colSize);
	driver.quit();
	
			}
}
