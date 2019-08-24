import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.SignUpForm;
import util.TestUtil;

public class SignUpFormTest extends TestBase {

	SignUpForm signup;
	TestUtil util;

	public SignUpFormTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		signup = new SignUpForm();
	}

	@Test
	public void test_signup() {
		signup.step_one(prop.getProperty("Firstname"), prop.getProperty("Lastname"), prop.getProperty("emailid"));
		util.selectvaluefromDroprown(signup.month, prop.getProperty("month"));
		util.selectvaluefromDroprown(signup.day, prop.getProperty("day"));
		util.selectvaluefromDroprown(signup.year, prop.getProperty("years"));
		util.selectvaluefromDroprown(signup.gender, prop.getProperty("gender"));
		signup.languages(prop.getProperty("langauge"));
		util.clickonNext(signup.next_Btn);

	}
}
