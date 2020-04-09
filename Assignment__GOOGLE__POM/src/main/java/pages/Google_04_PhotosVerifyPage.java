package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_PhotosVerifyPage extends TestBase {
	public Google_04_PhotosVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.Photosid)
	public WebElement Photosid;
	
	public void enterId(String id){
		Photosid.sendKeys(id);
		Photosid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Photospassword)
	public WebElement Photospassword;
	
	public void enterPassword(String password){
		Photospassword.sendKeys(password);
		Photospassword.sendKeys(Keys.ENTER);
		
	}
}
