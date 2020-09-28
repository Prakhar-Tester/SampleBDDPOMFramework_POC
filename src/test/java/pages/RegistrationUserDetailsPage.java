package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationUserDetailsPage {
	@FindBy(id="id_gender1")
	WebElement rdbtn_Gender;
	
	@FindBy(id="customer_firstname")
	WebElement txt_CustomerFirstName;
	
	@FindBy(id="customer_lastname")
	WebElement txt_CustomerLastName;
	
	
	@FindBy(id="passwd")
	WebElement txt_Password;
	
	@FindBy(id="firstname")
	WebElement txt_FirstName;
	
	@FindBy(id="lastname")
	WebElement txt_LastName;
	
	@FindBy(id="company")
	WebElement txt_CompanyName;
	
	@FindBy(id="address1")
	WebElement txt_Address;
	
	@FindBy(id="city")
	WebElement txt_City;
	
	@FindBy(id="id_state")
	WebElement drpdwn_State;
	
	@FindBy(id="postcode")
	WebElement txt_ZipCode;
	
	@FindBy(id="id_country")
	WebElement drpDwn_Country;
	
	@FindBy(id="phone_mobile")
	WebElement txt_MobPhone;
	
	@FindBy(id="alias")
	WebElement txt_AddressAlias;
	
	@FindBy(id="submitAccount")
	WebElement btn_Register;
	
	
	WebDriver driver;
	
	public RegistrationUserDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
