package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_MapVerifyPage extends TestBase {
	public Google_04_MapVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.Mapsid)
	public WebElement Mapsid;
	
	public void enterId(String id){
		Mapsid.sendKeys(id);
		Mapsid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Mappassword)
	public WebElement Mappassword;
	
	public void enterPassword(String password){
		Mappassword.sendKeys(password);
		Mappassword.sendKeys(Keys.ENTER);
		
	}
}
