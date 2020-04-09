package Testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;



public class Google_06_Test extends TestBase{
	public Google_06_Test(){
		PageFactory.initElements(driver,this);
	}
	@BeforeClass
	public void getTest() throws IOException {

		boolean nj = getTC("Google_06_Test");
		if (nj == false) {
			throw new SkipException("testcase is skipped");
		}
	}
	@BeforeMethod
	public void setBrowser() throws IOException{
		inti1();
	}
	
	@Test
	public void googleTest(){
		driver.close();
	}


}
