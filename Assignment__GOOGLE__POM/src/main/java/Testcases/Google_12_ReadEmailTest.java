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
import pages.Google_02_Page;
import pages.Google_03_GmailPage;
import pages.Google_04_GmailVerifyPage;
import pages.Google_10Page;
import pages.Google_11_GmailStarPage;
import pages.Google_12_ReadEmailPage;
import util.ExcelReader;



public class Google_12_ReadEmailTest extends TestBase{


	Google_11_GmailStarPage google11page;
	Google_01_Page google1page;
	Google_02_Page google2page;
	Google_03_GmailPage google3page;
	Google_04_GmailVerifyPage google4page;
	Google_10Page google10page;
	Set<String> handle = null;
	Iterator<String> it = null;
	String first = null, second = null;
	ExcelReader excelreader;
	String sheetname = "EmailId&Pass";
	public SoftAssert softassert;
	Google_12_ReadEmailPage google12page;
	
	
	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException{
		inti();
		softassert = new SoftAssert();
		google1page = new Google_01_Page();
		Thread.sleep(4000);
		google2page = google1page.clickGoogleAppButton();
		Thread.sleep(4000);
		google3page = google2page.clickGmail();
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

		boolean nj = getTC("Google_12_ReadEmailTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test(dataProvider="getValue")
	public void checkReademails(Hashtable<String,String> table) throws InterruptedException{
		google4page.enterId(table.get("Id"));
		Thread.sleep(5000);
		google12page=google4page.enterPasswordfor12_1page(table.get("Password"));
		Thread.sleep(5000);
		System.out.println("Read emails: "+google12page.getreademails());
	}
	
	@DataProvider
	public Object[][] getValue() throws EncryptedDocumentException, IOException{
		excelreader = new ExcelReader();
		return excelreader.getData(sheetname);
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
}
