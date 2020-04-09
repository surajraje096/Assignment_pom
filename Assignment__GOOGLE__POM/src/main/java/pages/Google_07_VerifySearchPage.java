package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import config.XPath;



public class Google_07_VerifySearchPage extends TestBase{
	public Google_07_VerifySearchPage(){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=XPath.nameXpath)
	public WebElement nameXpath;
	
	public String getWikipedieText(){
		return nameXpath.getText();
		
	}
	
	
	
	
	
}
