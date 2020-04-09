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
import pages.Google_03_PhotosPage;


public class Google_03_photosTest extends TestBase {

	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_PhotosPage Google_03_PhotosPage;
	SoftAssert softAssert;
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_03_photosTest");
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
		Google_03_PhotosPage = google_02_Page.clickPhotos();
	}
	

	@Test
	public void verifyTitalPhotos() {
		boolean flag = Google_03_PhotosPage.verifyTitalPhotos();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@Test
	public void verifygotoPhotos() {
		boolean flag = Google_03_PhotosPage.verifygotoPhotos();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
