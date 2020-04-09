package Testcases;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

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
import pages.Google_03_GmailPage;
import pages.Google_04_GmailVerifyPage;
import pages.Google_09_GmailAccountVerifyPage;
import pages.Google_14_GmailsendmailPage;
import pages.Google_16_MailwithAttachmentPage;
import pages.Google_17_GmailSettingVerifyPage;
import util.ExcelReader;
import pages.Google_02_Page;


public class Google_17_GoogleSettingVerifyTest extends TestBase {
	
	Google_16_MailwithAttachmentPage google16page;
	Google_14_GmailsendmailPage google14page;
	Set<String> handle = null;
	Iterator<String> it = null;
	String first = null, second = null;
	ExcelReader excelreader;
	String sheetname = "EmailId&Pass";
	Google_01_Page google1page;
	Google_02_Page Google_02_Page;
	Google_03_GmailPage google3page;
	Google_04_GmailVerifyPage google4page;

	public SoftAssert softassert;
	Google_17_GmailSettingVerifyPage google17page;

	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException {
		inti();
		softassert = new SoftAssert();
		google1page = new Google_01_Page();
		Thread.sleep(4000);
		Google_02_Page = google1page.clickGoogleAppButton();
		Thread.sleep(4000);
		google3page = Google_02_Page.clickGmail();
		Thread.sleep(4000);

		handle = driver.getWindowHandles();
		it = handle.iterator();
		first = it.next();

		Thread.sleep(4000);
		google4page = google3page.clickonsigninbuttonGmailpage();
		Thread.sleep(4000);

		handle = driver.getWindowHandles();
		it = handle.iterator();
		first = it.next();
		second = it.next();

		driver.switchTo().window(second);
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_17_GoogleSettingVerifyTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test(dataProvider = "getValue")
	public void checkSettingpageTest(Hashtable<String, String> table) throws InterruptedException {
		google4page.enterId(table.get("Id"));
		Thread.sleep(5000);
		Google_09_GmailAccountVerifyPage google9page = google4page.enterPasswordfor9page(table.get("Password"));
		Thread.sleep(5000);
		google17page=google9page.clickonSettingButton1();
		Thread.sleep(5000);
		boolean f = google17page.getActualstring();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	

	@DataProvider
	public Object[][] getValue() throws EncryptedDocumentException, IOException {
		excelreader = new ExcelReader();
		return excelreader.getData(sheetname);
	}

	@AfterMethod
	public void closeBrowser() {
		// driver.quit();
	}
}
