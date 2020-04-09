package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import config.XPath;



public class Google_08_ProductWebPage extends TestBase {
	
	public Google_08_ProductWebPage(){
		PageFactory.initElements(driver,this);
	}
	
	
	

	@FindBy(xpath=XPath.googlewebsearch)
	public WebElement seachproduct;
	
	public boolean checksearchproduct(){
		Assert.assertTrue(seachproduct.isDisplayed());
		return true;
		
	}
	
	@FindBy(xpath=XPath.googlewebchrome)
	public WebElement chromeproduct;
	
	public boolean checkchromeproduct(){
		Assert.assertTrue(chromeproduct.isDisplayed());
		return true;
		
	
	}
	
	@FindBy(xpath=XPath.googlewebtoolbar)
	public WebElement toolbarproduct;
	
	public boolean checkgooglewebtoolbar(){
		Assert.assertTrue(toolbarproduct.isDisplayed());
		return true;
		
	}
	
	
	@FindBy(xpath=XPath.googlewebBookmarks)
	public WebElement bookmarksproduct;
	
	public boolean checkbookmarksproduct(){
		Assert.assertTrue(bookmarksproduct.isDisplayed());
		return true;
	
	}
	
	@FindBy(xpath=XPath.googlemobile)
	public WebElement googlemobile;
	
	public boolean checkgooglemobile(){
		Assert.assertTrue( googlemobile.isDisplayed());
		return true;
	
	}
	
	
	@FindBy(xpath=XPath.googlemapsformobile)
	public WebElement googlemapsformobile;
	
	public boolean checkgooglemapsformobile(){
		Assert.assertTrue(googlemapsformobile.isDisplayed());
		return true;
	
	}
	
	@FindBy(xpath=XPath.googlesearchformobile)
	public WebElement googlesearchformobile;
	
	public boolean checkgooglesearchformobile(){
		Assert.assertTrue(googlesearchformobile.isDisplayed());
		return true;
	
	}
	
	@FindBy(xpath=XPath.googleadwords)
	public WebElement googleadwords;
	
	public boolean checkgoogleadwords(){
		return googleadwords.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleappsforworks)
	public WebElement googleappsforworks;
	
	public boolean checkgoogleappsforworks(){
		return googleappsforworks.isDisplayed();
	}
	
	/*@FindBy(xpath=XPath.googlemybusiness)
	public WebElement googlemybusiness;
	
	public boolean checkgooglemybusiness(){
		return googlemybusiness.isDisplayed();
	}*/
	
	@FindBy(xpath=XPath.googleadsense)
	public WebElement googleadsense;
	
	public boolean checkgoogleadsense(){
		return googleadsense.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleadmob)
	public WebElement googleadmob;
	
	public boolean checkgoogleadmob(){
		return googleadmob.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleyoutube)
	public WebElement googleyoutube;
	
	public boolean checkgoogleyoutube(){
		return googleyoutube.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlebooks)
	public WebElement googlebooks;
	
	public boolean checkgooglebooks(){
		return googlebooks.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleimagesearch)
	public WebElement googleimagesearch;
	
	public boolean checkgoogleimagesearch(){
		return googleimagesearch.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlenews)
	public WebElement googlenews;
	
	public boolean checkgooglenews(){
		return googlenews.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlevideosearch)
	public WebElement googlevideosearch;
	
	public boolean checkgooglevideosearch(){
		return googlevideosearch.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlepicasa)
	public WebElement googlepicasa;
	
	public boolean checkgooglepicasa(){
		return googlepicasa.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlemaps)
	public WebElement googlemaps;
	
	public boolean checkgooglemaps(){
		return googlemaps.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleearth)
	public WebElement googleearth;
	
	public boolean checkgoogleearth(){
		return googleearth.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlepanoramio)
	public WebElement googlepano;
	
	public boolean checkgooglepanoramio(){
		return googlepano.isDisplayed();
	}
	
	/*@FindBy(xpath=XPath.googlecustomesearch)
	public WebElement googlecustomesearch;
	
	public boolean checkgooglecustomesearch(){
		return googlecustomesearch.isDisplayed();
	}*/
	
	@FindBy(xpath=XPath.googlescholar)
	public WebElement googlescholer;
	
	public boolean checkgooglescholer(){
		return googlescholer.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googletrends)
	public WebElement googletrends;
	
	public boolean checkgoogletrends(){
		return googletrends.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlegmail)
	public WebElement googlegmail;
	
	public boolean checkgooglegmail(){
		return googlegmail.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googledrive)
	public WebElement googledrive;
	
	public boolean checkgoogledrive(){
		return googledrive.isDisplayed();
	}
	
	/*@FindBy(xpath=XPath.googledocs)
	public WebElement googledocs;
	
	public boolean checkgoogledocs(){
		return googledocs.isDisplayed();
	}*/
	
	@FindBy(xpath=XPath.googlesheets)
	public WebElement googlesheets;
	
	public boolean checkgooglesheets(){
		return googlesheets.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleslides)
	public WebElement googleslides;
	
	public boolean checkgoogleslisdes(){
		return googleslides.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googleforms)
	public WebElement googleforms;
	
	public boolean checkgoogleforms(){
		return googleforms.isDisplayed();
	}
	
	/*@FindBy(xpath=XPath.googledrawings)
	public WebElement googledrawings;
	
	public boolean checkgoogledrawings(){
		return googledrawings.isDisplayed();
	}*/
	
	@FindBy(xpath=XPath.googlesales)
	public WebElement googlesales;
	
	public boolean checkgooglesales(){
		return googlesales.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlecalendar)
	public WebElement googlecalendar;
	
	public boolean checkgooglecalendar(){
		return googlecalendar.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googletranslate)
	public WebElement googletranslate;
	
	public boolean checkgoogletranslate(){
		return googletranslate.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlecloudprint)
	public WebElement googlecloudprint;
	
	public boolean checkgooglecloudprint(){
		return googlecloudprint.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlekeeps)
	public WebElement googlekeeps;
	
	public boolean checkgooglekeeps(){
		return googlekeeps.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlestore)
	public WebElement googlestore;
	
	public boolean checkgooglestore(){
		return googlestore.isDisplayed();
	}
	
	/*@FindBy(xpath=XPath.googleplus1)
	public WebElement googleplus1;
	
	public boolean checkgoogleplus1(){
		return googleplus1.isDisplayed();
	}*/
	
	@FindBy(xpath=XPath.googleblogger)
	public WebElement googleblogger;
	
	public boolean checkgoogleblogger(){
		return googleblogger.isDisplayed();
	}
	
	@FindBy(xpath=XPath.googlehangouts)
	public WebElement googlehangouts;
	
	public boolean checkgooglehangouts(){
		return googlehangouts.isDisplayed();
	}
	
	/*@FindBy(xpath=XPath.googlecode)
	public WebElement googlecode;
	
	public boolean checkgooglecode(){
		return googlecode.isDisplayed();
	}*/
	


}
