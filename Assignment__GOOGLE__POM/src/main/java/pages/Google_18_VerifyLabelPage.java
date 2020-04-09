package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_18_VerifyLabelPage extends TestBase{

	public Google_18_VerifyLabelPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class=\"CJ\" and contains(text(),\"More\")]")
	public WebElement morebutton;
	
	public void clickonMorebutton(){
		morebutton.click();
	}
	
	@FindBy(xpath="//a[@class=\"CK\" and text()=\"Create new label\"]")
	public WebElement createnewlabelbutton;
	
	public void clickoncreatenewlabelbutton(){
		createnewlabelbutton.click();
	}
	
	@FindBy(xpath="//input[@id=':6b.na']")
	public WebElement newlabelname;
	
	public void createnewlabel(String x){
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("document.getElementById(':6b.na').value='xyz'");
		
		newlabelname.sendKeys(x);
		newlabelname.sendKeys(Keys.ENTER);
	}
	
	////*[@id=":mb"]/div/div[3]/span/a
	
	@FindBy(xpath="//*[@id=\":mb\"]/div/div[3]/span/a")
	public WebElement getActualtext;
	
	public String getActualText(){
		return getActualtext.getText();
	}
	
	
	
	
	
	
	
}
