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
import util.ExcelReader;
import pages.Google_03_DdrivePage;
import pages.Google_04_DriveVerifyPage;

public class Google_04_DriveVerifyTest extends TestBase {
	
	ExcelReader excelreader;
	String sheetname = "EmailId&Pass";
	public SoftAssert softassert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_DdrivePage Google_03_DdrivePage;
	Google_04_DriveVerifyPage g4;

	String sheetName = "LOGIN";
  
	@BeforeMethod
	public void setBrowser() throws IOException {
		inti();
		softassert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		Google_03_DdrivePage = google_02_Page.clickdriver();
		g4 = Google_03_DdrivePage.clickonSigninButton();
		g4 = new Google_04_DriveVerifyPage();
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_04_DriveVerifyTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test(dataProvider = "getValue")
	public void checkDriveisValidorNot(Hashtable<String, String> table) throws InterruptedException {

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

	/*@DataProvider
	public Object[][] gtData() throws EncryptedDocumentException, IOException {
		ExcelReader er = new ExcelReader();
		return er.getData("EmailId&Pass");
	}
*/
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
