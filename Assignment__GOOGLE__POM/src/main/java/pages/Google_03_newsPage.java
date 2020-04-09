package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_03_newsPage extends TestBase {

	public Google_03_newsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =XPath.TitalNews)
	public WebElement TitalNews;

	public boolean verifyTitalNews() {
		Assert.assertTrue( TitalNews.isDisplayed());
		return true;

	}

	@FindBy(xpath =XPath.Newstopstoris)
	public WebElement Newstopstoris;

	public boolean verifyNewstopstoris() {
		Assert.assertTrue( Newstopstoris.isDisplayed());
		return true;
	
	}
	@FindBy(xpath=XPath.Newssingbtn)
	public WebElement Newssingbtn;
	
	public Google_04_NewsVerifyPage clickonSigninButton(){
		Newssingbtn.click();
		return new Google_04_NewsVerifyPage();
	}

}
