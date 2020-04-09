package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_03_SearchPage extends TestBase {

	public Google_03_SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath =XPath.searchboxsearch)
	public WebElement searchboxsearch;

	public boolean verifysearchboxsearch() {
		Assert.assertTrue( searchboxsearch.isDisplayed());
		return true;
	
	}
	@FindBy(xpath =XPath.searchboxsearchbtn)
	public WebElement searchboxsearchbtn;

	public boolean verifysearchboxsearchbtn() {
		Assert.assertTrue( searchboxsearchbtn.isDisplayed());
		return true;
		
	}
	@FindBy(xpath =XPath.searchboxsearchlucky)
	public WebElement searchboxsearchlucky;

	public boolean verifysearchboxsearchlucky() {
		Assert.assertTrue( searchboxsearchlucky.isDisplayed());
		return true;
		
	}
	@FindBy(xpath=XPath.Searchsingbtn)
	public WebElement Searchsingbtn;
	
	public Google_04_SearchVerifyPage clickonSigninButton(){
		Searchsingbtn.click();
		return new Google_04_SearchVerifyPage();
	}

}
