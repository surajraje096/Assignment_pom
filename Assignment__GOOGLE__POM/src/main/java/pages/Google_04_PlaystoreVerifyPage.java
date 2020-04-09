package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_PlaystoreVerifyPage extends TestBase {
	public Google_04_PlaystoreVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.Playid)
	public WebElement Playid;
	
	public void enterId(String id){
		Playid.sendKeys(id);
		Playid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Photospassword)
	public WebElement Photospassword;
	
	public void enterPassword(String password){
		Photospassword.sendKeys(password);
		Photospassword.sendKeys(Keys.ENTER);
		
	}
}
