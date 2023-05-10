package DDF_POM_TestANg_baseclass_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Github_signout {
@FindBy(xpath="//button[contains(text(),'Sign out')]")private WebElement SignOutbtn;

public Github_signout(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void clickGithubSignOutbtn()
{
	SignOutbtn.click();
}
}
