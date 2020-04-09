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

import pages.Google_03_TranslatePage;

public class Google_03_translateTest extends TestBase{
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_TranslatePage Google_03_TranslatePage;
	SoftAssert softAssert;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		inti();
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickOnGoogleApp();
		Google_03_TranslatePage = google_02_Page.clickTranslates();
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_03_translateTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@Test
	public void verifyTranslatefun()
	{
		boolean flag = Google_03_TranslatePage.verifyTranslatefun();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
























}
