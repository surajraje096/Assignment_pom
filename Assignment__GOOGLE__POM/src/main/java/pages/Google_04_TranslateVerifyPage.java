package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;


public class Google_04_TranslateVerifyPage extends TestBase {
	public Google_04_TranslateVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath=XPath.Translateid)
	public WebElement Translateid;
	
	public void enterId(String id){
		Translateid.sendKeys(id);
		Translateid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Translatepassword)
	public WebElement Translatepassword;
	
	public void enterPassword(String password){
		Translatepassword.sendKeys(password);
		Translatepassword.sendKeys(Keys.ENTER);
		
	}
}
