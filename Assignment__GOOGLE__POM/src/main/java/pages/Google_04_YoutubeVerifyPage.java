package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;


public class Google_04_YoutubeVerifyPage extends TestBase {
	public Google_04_YoutubeVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=XPath.YouTubeid)
	public WebElement YouTubeid;
	
	public void enterId(String id){
		YouTubeid.sendKeys(id);
		YouTubeid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.YouTubepassword)
	public WebElement YouTubepassword;
	
	public void enterPassword(String password){
		YouTubepassword.sendKeys(password);
		YouTubepassword.sendKeys(Keys.ENTER);
		
	}
	
}
