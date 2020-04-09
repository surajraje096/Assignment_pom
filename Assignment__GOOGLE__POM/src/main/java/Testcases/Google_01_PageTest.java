package Testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Google_01_Page;

public class Google_01_PageTest extends TestBase {

	Google_01_Page google_01_Page;
	public SoftAssert softAssert;

	@BeforeMethod
	public void setUp() throws IOException {
		inti();
		google_01_Page = new Google_01_Page();
		softAssert = new SoftAssert();
	}

	@Test(priority = 1)
	public void verifySearchBox() {
		boolean flag = google_01_Page.verifySearchBox();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void verifySearchbtn() {
		boolean flag = google_01_Page.verifySearchbtn();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public void verifySearchluckybtn() {
		boolean flag = google_01_Page.verifySearchluckybtn();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
