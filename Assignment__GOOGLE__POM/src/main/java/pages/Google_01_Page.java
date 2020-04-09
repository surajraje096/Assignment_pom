package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;
import config.XPath;

public class Google_01_Page extends TestBase {

	public Google_01_Page() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = XPath.googlelogo)
	public WebElement googlelogo;
	
	@FindBy(xpath = XPath.searchbox)
	public WebElement SearchBox;

	@FindBy(xpath = XPath.searchbtn)
	public WebElement googleSearch;

	@FindBy(xpath = XPath.searchluckybtn)
	public WebElement iamfilinglucky;

	public  boolean verifygooglelogo() {
Assert.assertTrue(googlelogo.isDisplayed());
return true;

	}


	public boolean verifySearchBox() {
		
		Assert.assertTrue(SearchBox.isDisplayed());
	return true;
	}

	public boolean verifySearchbtn() {
		Assert.assertTrue(googleSearch.isDisplayed());
		return true;
	}

	public boolean verifySearchluckybtn() {
		Assert.assertTrue(iamfilinglucky.isDisplayed());
		return true;
	
	}

	@FindBy(xpath = XPath.googleapp)
	public WebElement GoogleApp;

	public Google_02_Page clickOnGoogleApp() {

		GoogleApp.click();
		// driver.switchTo().frame("id=\"I0_1570449213392\"");
		return new Google_02_Page();
	}

	@FindBy(xpath = XPath.hindilanguage)
	public WebElement hindilanguage;

	public Google_05_HindiPage clickonHindiLanguage() {

		// hindilanguage.click();
		GoogleApp.click();

		return new Google_05_HindiPage();
	}

	@FindBy(xpath = XPath.searchbox1)
	public WebElement searchbox1;

	public Google_07_VerifySearchPage entrevalueSearchbox(String amitabbachhan) {

		searchbox1.click();
		searchbox1.sendKeys("amitabbachhan");
		searchbox1.click();
		searchbox1.sendKeys(Keys.ENTER);
		return new Google_07_VerifySearchPage();
	}

	@FindBy(xpath = XPath.googleapp)
	WebElement googleapp;

	public Google_02_Page clickGoogleAppButton() {
		googleapp.click();
		return new Google_02_Page();
	}

}
