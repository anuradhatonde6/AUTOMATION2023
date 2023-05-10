package autoation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;



public class openBrowser {
	public static void main(String[] args) throws InterruptedException{
		String expUrl = "https://www.selenium.dev/downloads/";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*"); 
		WebDriver driver=new ChromeDriver(opt);    

        driver.get("https://www.selenium.dev/downloads/");
        String actUrl = driver.getCurrentUrl();
    	System.out.println(actUrl);//https://www.selenium.dev/downloads/
    	
    	if(actUrl.equals(expUrl)) {
    		System.out.println("pass");
    	}else {
    		System.out.println("fail");
    	}
			//driver.quit();
			//driver.manage().window().maximize();

			//driver.manage().window().minimize();
		Thread.sleep(2000);

			 driver.close();
			

			//7. getTitle()
			//String actTitle = driver.getTitle();
			//System.out.println(actTitle);
			

		}
	}
	


