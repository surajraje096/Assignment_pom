package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_NewsVerifyPage extends TestBase  {
	public Google_04_NewsVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.Newsid)
	public WebElement Newsid;
	
	public void enterId(String id){
		Newsid.sendKeys(id);
		Newsid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Newspassword)
	public WebElement Newspassword;
	
	public void enterPassword(String password){
		Newspassword.sendKeys(password);
		Newspassword.sendKeys(Keys.ENTER);
		
	}
}
