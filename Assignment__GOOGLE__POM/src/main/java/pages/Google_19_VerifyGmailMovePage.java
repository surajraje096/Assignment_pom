package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_19_VerifyGmailMovePage extends TestBase{

	public Google_19_VerifyGmailMovePage(){
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//*[@id=\":bz\"]")
	public WebElement checkbox;
	
	public void clickonCheckbox(){
		checkbox.sendKeys(Keys.ENTER);
		checkbox.click();
	}
	
	@FindBy(xpath="//div[@id=\":c6\"]")
	public WebElement movebutton;
	
	public void clickonmovebutton(){
		movebutton.click();
	}
	
	
	@FindBy(xpath="//div[@id=\":13q\"]//div[@class=\"J-N-Jz\"]")
	public WebElement selectMoveOption;
	
	public void clickonMoveOption(){
		selectMoveOption.click();
	}
	
	@FindBy(xpath="//div[@class=\"aio aip\"]")
	public WebElement clickonlabelbutton;
	
	public void clickonlabelButton(){
		clickonlabelbutton.click();
	}
	
	@FindBy(xpath="//td[@id=\":cj\"]")
	public WebElement verifyemail;
	
	public boolean verifyemail(){
		return verifyemail.isDisplayed();
	}
}
