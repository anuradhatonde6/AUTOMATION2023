package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubhomepage {
	@FindBy(xpath="(//summary[@class='Header-link'])[2]")private WebElement signoutbtn;
	public Githubhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void clickGithubhomepagesignoutbtn()
{
	signoutbtn.click();
	}
}