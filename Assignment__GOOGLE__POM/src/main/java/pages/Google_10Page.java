package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_10Page extends TestBase{
	public Google_10Page(){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class=\"bsU\"]")
	public WebElement indexvalue;
	
	public String getIndexvalue(){
		return indexvalue.getText();
	}
	
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")
	public WebElement totalvalue;
	
	public String gettotalvalue(){
		drawBorder(totalvalue, driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return indexvalue.getText();
	}
	
	@FindBy(xpath="//div[@id=\":k5\"]")
	public WebElement forward;
	
	public boolean getforwardvalue(){
		return forward.isEnabled();
	}
	
	public void clickOnForward(){
		drawBorder(forward, driver);
		forward.click();
	}
	
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")
	public WebElement xyz;
	
	public String getActualNumberofEmail(){
		return xyz.getText();
	}
	
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[1]/span[2]")
	public WebElement abc;
	
	public String getNumberofEmail(){
		return abc.getText();
	}
	
	


}
