package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class SignUpForm extends TestBase {

	// Object Repository
	@FindBy(id = "firstName")
	WebElement f_name;
	@FindBy(id = "lastName")
	WebElement l_name;
	@FindBy(id = "email")
	WebElement email_add;
	
	@FindBy (className = "ui-select-match-text pull-left")
public	WebElement month;
	@FindBy (className = "btn btn-default form-control ui-select-toggle")
public	WebElement day;
	
	@FindBy(className = "btn btn-default form-control ui-select-toggle")
public	WebElement year;
	
	@FindBy(className="form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched")
public	WebElement gender;
	
	@FindBy (className="ui-select-search input-xs ng-valid ng-dirty ng-empty ng-touched")
	WebElement language;
	
	
	@FindBy (className = "btn btn-blue")
public	WebElement next_Btn;

	public SignUpForm() {
		PageFactory.initElements(driver, this);
	}

	public void step_one(String fname, String lname, String emailid) {
		f_name.sendKeys(fname);
		l_name.sendKeys(lname);
		email_add.sendKeys(emailid);
		
	}
	
	public void languages(String value) {
		language.sendKeys(value);
	}
	
	
	
	
	
	

}
