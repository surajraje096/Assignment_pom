package Testcases;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import util.ExcelReader;

public class Google_10Test extends TestBase {
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
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_10Test");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException {
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

		Thread.sleep(4000);
		driver.switchTo().window(first);
		Thread.sleep(4000);
		driver.switchTo().window(second);
		System.out.println(first + "-----------" + second);
	}

	@Test(dataProvider = "getValue")
	public void checkgmail(Hashtable<String, String> table) throws InterruptedException {
		google4page.enterId(table.get("Id"));
		Thread.sleep(5000);
		google10page = google4page.enterPasswordfor10page(table.get("Password"));

		String str1 = google10page.getActualNumberofEmail();
		System.out.println(str1); // 1

		int no = Integer.parseInt(str1);
		int click = no / 50; // 1/50
		System.out.println(click); // 0
		String str2 = google10page.getNumberofEmail();
		System.out.println(str2); // 1

	

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