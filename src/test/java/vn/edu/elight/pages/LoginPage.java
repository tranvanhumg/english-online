package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{

	@FindBy(name = "email")
	WebElementFacade emailField;
	
	public void enterEmail(String email) {
		//emailField.sendKeys(email);
	//	$("//input[@ng-model='data.email']").sendKeys(email);
		element(emailField).sendKeys(email);
		element("//input[@ng-model='data.email']").sendKeys(email);	
	}
	
	
	WebElementFacade password_in; //using id, name
	
	public void EnterPassword(String pwd) {
		password_in.sendKeys(pwd);
	}
}
