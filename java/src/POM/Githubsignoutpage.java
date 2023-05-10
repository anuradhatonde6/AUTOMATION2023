package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Githubsignoutpage {
	@FindBy(xpath="//button[contains(text(),' Sign out')]")private WebElement signout;
public Githubsignoutpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
	}
public void clickGithubhomepagesignoutbtn()
{
	signout.click();
	}

}
