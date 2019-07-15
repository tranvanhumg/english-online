package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{
	
	@FindBy(xpath = "//span[text()='ĐĂNG NHẬP']")
	WebElementFacade Loginbt;
	
	public void clickOnLoginButton() {
		Loginbt.waitUntilClickable().click();
	}

}
