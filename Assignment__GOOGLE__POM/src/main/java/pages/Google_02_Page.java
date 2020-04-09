package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;


public class Google_02_Page extends TestBase {

	

	public Google_02_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Account']")
	public WebElement account;

	public Boolean verifyAccount() {

		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(account.isDisplayed());
		return true;

	}

	public Google_03_AccountPage clickOnMyAccount() {

		driver.switchTo().frame(0);
		account.click();

		return new Google_03_AccountPage();
	}

	@FindBy(xpath = XPath.Search)
	public WebElement search;

	public boolean verifysearch() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(search.isDisplayed());
		return true;
	
	}

	public Google_03_SearchPage clicksearch() {

		driver.switchTo().frame(0);
		search.click();

		return new Google_03_SearchPage();
	}

	@FindBy(xpath = XPath.Maps)
	public WebElement map;

	public boolean verifymaps() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(map.isDisplayed());
		return true;
		
	}
	public Google_03_MapsPage clickMaps() {

		driver.switchTo().frame(0);
		map.click();

		return new Google_03_MapsPage();
	}

	@FindBy(xpath = XPath.YouTube)
	public WebElement youtube;

	public boolean verifyyoutube() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	Assert.assertTrue(youtube.isDisplayed());
		return true;
	
	}
	public Google_03_YoutubePage clickYoutube() {

		driver.switchTo().frame(0);
		youtube.click();

		return new Google_03_YoutubePage();
	}

	@FindBy(xpath = XPath.Play)
	public WebElement play;

	public boolean verifyplay() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Assert.assertTrue(play.isDisplayed());
		return true;
		
	}
	public Google_03_playPage clickplay() {

		driver.switchTo().frame(0);
		play.click();

		return new Google_03_playPage();
	}

	@FindBy(xpath = XPath.News)
	public WebElement News;

	public boolean verifyNews() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Assert.assertTrue(play.isDisplayed());
		return true;
		
	}
	public Google_03_newsPage clickNews() {

		driver.switchTo().frame(0);
		News.click();

		return new Google_03_newsPage();
	}

	@FindBy(xpath = XPath.Gmail)
	public WebElement Gmail;

	public boolean verifyGmail() {
		driver.switchTo().frame(0);
		Gmail.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Assert.assertTrue(Gmail.isDisplayed());
		return true;

	}
	public Google_03_GmailPage clickGmail() {

		driver.switchTo().frame(0);
		Gmail.click();

		return new Google_03_GmailPage();
	}

	@FindBy(xpath = XPath.Drive)
	public WebElement Drive;

	public boolean verifyDrive() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(Drive.isDisplayed());
		return true;
		
	}
	public Google_03_DdrivePage clickdriver() {

		driver.switchTo().frame(0);
		Drive.click();

		return new Google_03_DdrivePage();
	}

	@FindBy(xpath = XPath.Translate)
	public WebElement Translate;

	public boolean verifyTranslate() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Assert.assertTrue(Translate.isDisplayed());
		return true;
	
	}
	public Google_03_TranslatePage clickTranslates() {

		driver.switchTo().frame(0);
		Translate.click();

		return new Google_03_TranslatePage();
	}

	@FindBy(xpath = XPath.Photos)
	public WebElement Photos;

	public boolean verifyPhotos() {
		driver.switchTo().frame(0);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}Assert.assertTrue(Photos.isDisplayed());
		return true;
		
	}
	public Google_03_PhotosPage clickPhotos() {

		driver.switchTo().frame(0);
		Photos.click();

		return new Google_03_PhotosPage();
	}
	@FindBy(xpath="//a[@class=\"gb_d\" and @id=\"gb23\"]")
	@CacheLookup
	public WebElement gmail;
	
	public boolean checkGmailLink(){
		drawBorder(gmail, driver);
		return isAvailable(gmail);
	}
	public Google_03_GmailPage checkGmail(){
		drawBorder(gmail, driver);
		gmail.click();
		return new Google_03_GmailPage();
	}
	

}