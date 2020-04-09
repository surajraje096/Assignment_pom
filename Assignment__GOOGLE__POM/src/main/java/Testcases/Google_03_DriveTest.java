package Testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
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
import pages.Google_03_DdrivePage;

public class Google_03_DriveTest extends TestBase {
	boolean google03drivepage;
	Google_01_Page google01page;
	Google_02_Page google02page;

	public SoftAssert softassert;

	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException {
		inti();

		softassert = new SoftAssert();
		google01page = new Google_01_Page();
		google02page = google01page.clickGoogleAppButton();
		Thread.sleep(5000);
		google03drivepage = google02page.verifyDrive();
	}

	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC(" Google_03_DriveTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}

	/*
	 * @Test public void verifyGoogledrive() { boolean flag =
	 * google03drivepage.verifyGoogledrive(); softassert.assertTrue(flag);
	 * softassert.assertAll(); }
	 */
	@Test
	public void verifyGoogleMeetdrive() {
		boolean flag = Google_03_DdrivePage.verifyGoogleMeetdrive();
		softassert.assertTrue(flag);
		softassert.assertAll();
	}

	@Test
	public void verifyGoogleusingDrive() {
		boolean flag = Google_03_DdrivePage.verifyGoogleusingDrive();
		softassert.assertTrue(flag);
		softassert.assertAll();
	}

	@Test
	public void verifyGooglgotoDrive() {
		boolean flag = Google_03_DdrivePage.verifyGooglgotoDrive();
		softassert.assertTrue(flag);
		softassert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
