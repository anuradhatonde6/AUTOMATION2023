package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Githubtest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anuradha\\Downloads\\chromedriver_win321\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		
		Githubsignin signin=new Githubsignin(driver);
		signin.clickGithubsignbtn();
		Thread.sleep(4000);
		
		Githublogin login=new Githublogin(driver);
		login.setGithubloginUN();
		login.setGithubloginPWD();
		login.clickGithubloginbtn();
		Thread.sleep(4000);
		
		Githubhomepage home=new Githubhomepage(driver);
	    home.clickGithubhomepagesignoutbtn();
	    Thread.sleep(4000);
	    
	    Githubsignoutpage signout=new Githubsignoutpage(driver);
	    signout.clickGithubhomepagesignoutbtn();
	    Thread.sleep(2000);
	    driver.quit();
	    		
		}

}
