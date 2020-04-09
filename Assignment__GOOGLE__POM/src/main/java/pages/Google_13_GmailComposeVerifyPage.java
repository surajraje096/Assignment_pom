package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_13_GmailComposeVerifyPage extends TestBase{

	public Google_13_GmailComposeVerifyPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")
	public WebElement composebuttom;
	
	public void clickonComposebutton(){
		composebuttom.click();
	}
	
	@FindBy(xpath="/html/body/div[21]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody")
	public WebElement compose;
	
	public boolean checkComposebody(){
		return compose.isDisplayed();
	}
}
