package Testcases;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import config.XPath;
import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;
import pages.Google_01_Page;
import pages.Google_07_VerifySearchPage;

public class Google_07_VerifySearchTest extends TestBase{
	
	Google_01_Page google1page;
	Google_07_VerifySearchPage google7page;
	public SoftAssert softassert;
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_07_VerifySearchTest");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@BeforeMethod
	public void setBrowser() throws InterruptedException, IOException{
		inti();
		softassert = new SoftAssert();
		google1page = new Google_01_Page();
		google7page=google1page.entrevalueSearchbox("google");
		
	}
	
	@Test
	public void checkGoogleSearchPage1() throws InterruptedException{
		//Thread.sleep(3000);
		String expected  = XPath.google;
		String actual = google7page.getWikipedieText();
		
		if(actual.contains(expected)){
			softassert.assertTrue(true);
		}else{
			softassert.assertTrue(false);
		}softassert.assertAll();
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

















}
