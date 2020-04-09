package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_SearchVerifyPage extends TestBase {
	public Google_04_SearchVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.searchid)
	public WebElement searchid;
	
	public void enterId(String id){
		searchid.sendKeys(id);
		searchid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.searchpassword)
	public WebElement searchpassword;
	
	public void enterPassword(String password){
		searchpassword.sendKeys(password);
		searchpassword.sendKeys(Keys.ENTER);
		
	}
}
