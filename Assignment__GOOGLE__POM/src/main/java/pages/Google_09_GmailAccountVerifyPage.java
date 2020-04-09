package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;



public class Google_09_GmailAccountVerifyPage extends TestBase {
	public Google_09_GmailAccountVerifyPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"gbwa\"]/div[1]/a")
	public WebElement appmenu;

	@FindBy(xpath = "//span[text()='Gmail']")
	public WebElement googleicon;

	@FindBy(xpath = "//*[@id=\":1j\"]/div[1]")
	public WebElement Settingbutton1;

	@FindBy(xpath = "//*[@id=\"ms\"]/div")
	public WebElement Settings1;

	public void clickGmailAccount() throws InterruptedException {
		Thread.sleep(5000);
		appmenu.click();

		Thread.sleep(5000);
		googleicon.click();

	}
	
	@FindBy(xpath="//div[@class='aos T-I-J3 J-J5-Ji']")
	public WebElement Settingbutton;
	
	@FindBy(xpath="//div[@class='J-N-Jz' and text()='Settings']")
	public WebElement Settings;
	
	public Google_17_GmailSettingVerifyPage clickonSettingButton1() throws InterruptedException{
		Thread.sleep(7000);
		driver.switchTo().frame(2);
		Thread.sleep(7000);
		Settingbutton.click();
		Thread.sleep(7000);
		Settings.click();
		return new Google_17_GmailSettingVerifyPage();
		
	}
	

	public Google_17_GmailSettingVerifyPage clickonSettingButton() throws InterruptedException {
		Thread.sleep(5000);
		Settingbutton1.click();
		Thread.sleep(5000);
		Settings1.click();
		return new Google_17_GmailSettingVerifyPage();

	}

	@FindBy(xpath = "//*[@class=\"gb_Ia gbii\"]")
	public WebElement accountbutton;

	public void clickonAccountButton() {
		accountbutton.click();
	}

	@FindBy(xpath = "//*[@id=\"gb_71\"]")
	public WebElement signoutbutton;

	public Goolge_20_GmailSignOutPage clickonSignoutButton() {
		signoutbutton.click();
		return new Goolge_20_GmailSignOutPage();
	}
}
