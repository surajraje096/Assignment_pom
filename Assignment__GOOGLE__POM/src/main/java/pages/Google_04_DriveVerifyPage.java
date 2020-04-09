package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_04_DriveVerifyPage extends TestBase{
	public Google_04_DriveVerifyPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.Driveid)
	public WebElement Driveid;
	
	public void enterId(String id){
		Driveid.sendKeys(id);
		Driveid.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath=XPath.Drivepassword)
	public WebElement Drivepassword;
	
	public void enterPassword(String password){
		Drivepassword.sendKeys(password);
		Drivepassword.sendKeys(Keys.ENTER);
		
	}

}
