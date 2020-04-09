package Testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Google_01_Page;
import pages.Google_02_Page;

import pages.Google_03_SearchPage;
import pages.Google_05_HindiPage;
public class Google_05_HindiTest extends TestBase{
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_SearchPage Google_03_SearchPage;
	Google_05_HindiPage Google_05_HindiPage;
	SoftAssert softAssert;
	

	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException{
		inti();
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		Google_03_SearchPage = google_02_Page.clicksearch();
		Google_05_HindiPage  =new Google_05_HindiPage();
			
			}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_05_HindiTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	
	@Test
	public void checkGooglePageinHindiLanguage() throws InterruptedException{
		Google_05_HindiPage.getActualhindigooglesearchText();
		
	}	
	

	@AfterMethod
	public void closebrowse() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	























}
