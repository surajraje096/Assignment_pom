package Testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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
import pages.Google_03_AccountPage;
import pages.Google_04_AccountVerifyPage;
import util.ExcelReader;


public class Google_04_AccountVerifyTest extends TestBase {

	ExcelReader excelreader;
	String sheetname = "EmailId&Pass";
	public SoftAssert softassert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_AccountPage google_03_AccountPage;
	Google_04_AccountVerifyPage g4;

	String sheetName = "LOGIN";

	@BeforeMethod
	public void setBrowser() throws IOException {
		inti();
		softassert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		google_03_AccountPage = google_02_Page.clickOnMyAccount();
		g4 = google_03_AccountPage.clickonSigninButton();
		g4 = new Google_04_AccountVerifyPage();
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_04_AccountVerifyTest");
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
