package Testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Google_01_Page;
import pages.Google_02_Page;
import pages.Google_04_PlaystoreVerifyPage;
import util.ExcelReader;
import pages.Google_03_playPage;

public class Google_04_PlaystoreVerifyTest extends TestBase{
	
	ExcelReader excelreader;
	String sheetname = "EmailId&Pass";
	public SoftAssert softassert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_playPage Google_03_playPage;
	Google_04_PlaystoreVerifyPage g4;
	String sheetName = "LOGIN";

	@BeforeMethod
	public void setBrowser() throws IOException {
		inti();
		softassert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		Google_03_playPage = google_02_Page.clickplay();
		g4 = Google_03_playPage.clickonSigninButton();
		g4 = new Google_04_PlaystoreVerifyPage();
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_04_PlaystoreVerifyTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test(dataProvider = "getValue")
	public void checkAccountisValidorNot(Hashtable<String, String> table) throws InterruptedException {

		g4.enterId(table.get("Id"));
		Thread.sleep(5000);
		g4.enterPassword(table.get("Password"));
		Thread.sleep(5000);

	}

	@DataProvider
	public Object[][] getValue() throws EncryptedDocumentException, IOException {
		excelreader = new ExcelReader();
		return excelreader.getData("EmailId&Pass");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}


	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
