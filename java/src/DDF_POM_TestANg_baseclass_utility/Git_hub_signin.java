package DDF_POM_TestANg_baseclass_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Git_hub_signin {
@FindBy(xpath="//a[contains(text(),'Sign in')]")private WebElement SI;

public Git_hub_signin(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
public void click_Github_signin_btn()
{
	SI.click();
}
}
