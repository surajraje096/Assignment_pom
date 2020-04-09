package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.Google_01_Page;
import pages.Google_02_Page;
import pages.Google_03_AccountPage;

public class CommanMethodTest extends TestBase {
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_AccountPage google_03_AccountPage;
	public void comman1() throws IOException {
		inti();
		Google_01_Page Google_01_Page= new Google_01_Page();
		Google_01_Page.clickGoogleAppButton();
		Google_02_Page google_02_Page=new Google_02_Page();
		google_02_Page.clickOnMyAccount();
		google_03_AccountPage.verifyGoogleAccount();
		
	}
	
	
	
	


	}


