package DDF_POM_TestANg_baseclass_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_login {
@FindBy(xpath="//input[@id='login_field']")private WebElement UN;
@FindBy(xpath="//input[@id='password']")private WebElement PWD;
@FindBy(css="input[type='submit']")private WebElement loginbtn;
public Github_login(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
public void setGithubloginusername(String username)
{
UN.sendKeys(username);	
}
public void setGithubloginpassword(String password)
{
PWD.sendKeys(password);	
}
public void clickGithuboginbtn()
{
	loginbtn.click();
}
}