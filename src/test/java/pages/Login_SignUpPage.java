package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestBase;

public class Login_SignUpPage extends TestBase {

	@FindBy(id="email_create")
	WebElement txt_EmailCreate;
	
	@FindBy(name="SubmitCreate")
	WebElement btn_CreateAcountBtn;
	
	@FindBy(id="email")
	WebElement txt_UserEmail;
	
	@FindBy(id="passwd")
	WebElement txt_UserPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement btn_SignInBtn;
	
	@FindBy(xpath="//h1[contains (text(),'Authentication')]")
	WebElement lbl_authentication;
	
	WebDriver driver;
	
	public Login_SignUpPage(WebDriver driver) {
		this.driver=driver;//need to check if this works without passig webdriver in constructor
		//or need to pass super() in test class constrcutor
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyAuthenticationLabel() {
		return lbl_authentication.isDisplayed();
	}
	
	public void clickCreateAnAccount(String email) {
		txt_EmailCreate.sendKeys(email);
		btn_CreateAcountBtn.click();
		//return new registration UserDetailsPage()
	}
	
	public void login(String username,String password) {
		txt_UserEmail.sendKeys(username);
		txt_UserPassword.sendKeys(password);
		btn_SignInBtn.click();
		//return new UserAccountPage() 
	}
	
}
