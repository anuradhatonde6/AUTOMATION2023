package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githublogin {
	@FindBy(xpath="//input[@id='login_field']")private WebElement UN;
	@FindBy(xpath="//input[@id='password']")private WebElement PWD;
	@FindBy(css="input[type='submit']")private WebElement loginbtn;
	public  Githublogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setGithubloginUN()
	{


		UN.sendKeys("futaneanuradha@gmail.com");
	}
	public void setGithubloginPWD()

	{
		PWD.sendKeys("anshvansh25");
	}
	public void clickGithubloginbtn()
	{
		loginbtn.click();
	}

}
