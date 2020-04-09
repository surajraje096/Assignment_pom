package Testcases;

import java.io.IOException;

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
import pages.Google_03_AccountPage;

public class Google_03_AccountPageTest extends TestBase {
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_AccountPage google_03_AccountPage;
	SoftAssert softAssert;
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC(" Google_03_AccountPageTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}

	@BeforeMethod
	public void setUp() throws IOException {
		inti();
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		google_03_AccountPage = google_02_Page.clickOnMyAccount();

	}
	

	@Test
	public void verifyGoogleAccount() {
		boolean flag = google_03_AccountPage.verifyGoogleAccount();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
