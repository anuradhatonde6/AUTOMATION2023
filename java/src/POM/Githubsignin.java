package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubsignin {
	@FindBy(xpath="//a[contains(text(),'Sign in')]")private WebElement signin;
	public Githubsignin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickGithubsignbtn()
	{
		signin.click();
	}
}
