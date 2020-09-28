package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class LandingPage  extends TestBase{
	
	@FindBy(xpath="//a[contains(text(),\"Sign in\")]") 
	WebElement btn_SignInButton;

	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnSignIn() {
		btn_SignInButton.click();
		//return new Login_SignUpPage();
	}
	public String verifyLandingPageTitle(){
		return driver.getTitle();

	}
}
