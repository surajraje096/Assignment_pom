package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;



public class Google_17_GmailSettingVerifyPage extends TestBase{

	public Google_17_GmailSettingVerifyPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\":4\"]/div/div[1]/div[1]")
	public WebElement settingtext;
	
	public boolean getActualstring(){
		Assert.assertTrue(settingtext.isDisplayed());
		return true;
	
	}
	
}
