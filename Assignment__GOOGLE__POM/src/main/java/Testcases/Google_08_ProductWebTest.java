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
import pages.Google_08_ProductWebPage;

public class Google_08_ProductWebTest extends TestBase{
	Google_08_ProductWebPage google8page;
	public SoftAssert softassert;
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_08_ProductWebTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@BeforeMethod
	public void setBrowser() throws IOException{
		inti();
		softassert = new SoftAssert();
		google8page=googleProductWebPage(); 
	}
	
	@Test(priority=1)
	public void websearchproductTest(){
		boolean f = google8page.checksearchproduct(); 
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=2)
	public void webchromeproductTest(){
		boolean f = google8page.checkchromeproduct();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=3)
	public void googlewebtoolbarTest(){
		boolean f = google8page.checkgooglewebtoolbar();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=4)
	public void bookmarksproductTest(){
		boolean f = google8page.checkbookmarksproduct();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=5)
	public void googlemobileTest(){
		boolean f = google8page.checkgooglemobile();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=6)
	public void googlemapsformobileTest(){
		boolean f = google8page.checkgooglemapsformobile();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=7)
	public void googlesearchformobileTest(){
		boolean f = google8page.checkgooglesearchformobile();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=8)
	public void googleadwordsTest(){
		boolean f = google8page.checkgoogleadwords();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=9)
	public void googleappsforworksTest(){
		boolean f = google8page.checkgoogleappsforworks();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=10)
	public void googlemybusinessTest(){
		boolean f = google8page.checkgooglemybusiness();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=11)
	public void googleadsenseTest(){
		boolean f = google8page.checkgoogleadsense();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=12)
	public void googleadmobTest(){
		boolean f = google8page.checkgoogleadmob();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=13)
	public void googleyoutubeTest(){
		boolean f = google8page.checkgoogleyoutube();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=14)
	public void googlebooksTest(){
		boolean f = google8page.checkgooglebooks();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=15)
	public void googleimagesearchTest(){
		boolean f = google8page.checkgoogleimagesearch();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=16)
	public void googlenewsTest(){
		boolean f = google8page.checkgooglenews();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=17)
	public void googlevideosearchTest(){
		boolean f = google8page.checkgooglevideosearch();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=18)
	public void googlepicasaTest(){
		boolean f = google8page.checkgooglepicasa();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=19)
	public void googlemapsTest(){
		boolean f = google8page.checkgooglemaps();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=20)
	public void googleearthTest(){
		boolean f = google8page.checkgoogleearth();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=21)
	public void googlepanoramioTest(){
		boolean f = google8page.checkgooglepanoramio();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=22)
	public void googlecustomesearchTest(){
		boolean f = google8page.checkgooglecustomesearch();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=23)
	public void googlescholarTest(){
		boolean f = google8page.checkgooglescholer();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=24)
	public void googletrendsTest(){
		boolean f = google8page.checkgoogletrends();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=25)
	public void googlegmailTest(){
		boolean f = google8page.checkgooglegmail();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=26)
	public void googledriveTest(){
		boolean f = google8page.checkgoogledrive();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=27)
	public void googledocsTest(){
		boolean f = google8page.checkgoogledocs();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=28)
	public void googlesheetsTest(){
		boolean f = google8page.checkgooglesheets();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=29)
	public void googleslidesTest(){
		boolean f = google8page.checkgoogleslisdes();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=30)
	public void googleformsTest(){
		boolean f = google8page.checkgoogleforms();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=31)
	public void googledrawingsTest(){
		boolean f = google8page.checkgoogledrawings();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=32)
	public void googlesalesTest(){
		boolean f = google8page.checkgooglesales();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=33)
	public void googlecalendarTest(){
		boolean f = google8page.checkgooglecalendar();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=34)
	public void googletranslateTest(){
		boolean f = google8page.checkgoogletranslate();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=35)
	public void googlecloudprintTest(){
		boolean f = google8page.checkgooglecloudprint();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=36)
	public void googlekeepsTest(){
		boolean f = google8page.checkgooglekeeps();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=37)
	public void googlestoreTest(){
		boolean f = google8page.checkgooglestore();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	/*@Test(priority=38)
	public void googleplus1Test(){
		boolean f = google8page.checkgoogleplus1();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@Test(priority=39)
	public void googlebloggersTest(){
		boolean f = google8page.checkgoogleblogger();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
	@Test(priority=40)
	public void googlehangoutsTest(){
		boolean f = google8page.checkgooglehangouts();
		softassert.assertTrue(f);
		softassert.assertAll();
	}
	
/*	@Test(priority=41)
	public void googlecodeTest(){
		boolean f = google8page.checkgooglecode();
		softassert.assertTrue(f);
		softassert.assertAll();
	}*/
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
