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



public class Google_02_PageTest extends TestBase {

	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	SoftAssert softAssert;

	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_02_PageTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		inti();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();

		softAssert = new SoftAssert();

	}

	@Test(priority=1)
	public void verifyAccount() {

		boolean flag=google_02_Page.verifyAccount();
		System.out.println("Account is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	@Test(priority=2)
	public void verifySearch() {

		boolean flag=google_02_Page.verifysearch();
		System.out.println("Search is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=3)
	public void verifyMaps() {

		boolean flag=google_02_Page.verifymaps();
		System.out.println("Maps is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=4)
	public void verifyYouTube() {

		boolean flag=google_02_Page.verifyyoutube();
		System.out.println("YouTube is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=5)
	public void verifyPlay() {

		boolean flag=google_02_Page.verifyplay();
		System.out.println("Play is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=6)
	public void verifyNews() {

		boolean flag=google_02_Page.verifyNews();
		System.out.println("News is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=7)
	public void verifyGmail() {

		boolean flag=google_02_Page.verifyGmail();
		System.out.println("Gmail is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=8)
	public void verifyDrive() {

		boolean flag=google_02_Page.verifyDrive();
		System.out.println("Drive is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=9)
	public void verifyTranslate() {

		boolean flag=google_02_Page.verifyTranslate();
		System.out.println("Translate is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}
	@Test(priority=10)
	public void verifyPhotos() {

		boolean flag=google_02_Page.verifyPhotos();
		System.out.println("Photos is display");
		softAssert.assertTrue(flag);
		softAssert.assertAll();
}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
