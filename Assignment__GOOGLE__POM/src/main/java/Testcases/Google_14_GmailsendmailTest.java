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
import pages.Google_14_GmailsendmailPage;
import util.ExcelReader;
import pages.Google_02_Page;
import pages.Google_03_GmailPage;
import pages.Google_04_GmailVerifyPage;
import pages.Google_13_GmailComposeVerifyPage;


public class Google_14_GmailsendmailTest extends TestBase {

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
		Google_13_GmailComposeVerifyPage google13page;
		public SoftAssert softassert;

	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException{
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

		boolean nj = getTC("Google_14_GmailsendmailTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test(dataProvider = "getValue")
	public void checkEmailsendornot(Hashtable<String, String> table) throws InterruptedException {

		google13page = new Google_13_GmailComposeVerifyPage();
		google4page.enterId(table.get("Id"));
		Thread.sleep(5000);
		google14page = google4page.enterPasswordfor14page(table.get("Password"));
		Thread.sleep(5000);

		google13page.clickonComposebutton();
		Thread.sleep(5000);
		google14page.sendmailTo();
		Thread.sleep(5000);
		google14page.sendmailsubject();
		Thread.sleep(5000);
		google14page.sendmailsendbttan();
		Thread.sleep(5000);
	}

	@DataProvider
	public Object[][] getValue() throws EncryptedDocumentException, IOException {
		excelreader = new ExcelReader();
		return excelreader.getData(sheetname);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
