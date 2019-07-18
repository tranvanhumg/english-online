package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.AuthenFBPage;

public class AuthenFBSteps {
	AuthenFBPage onAuthenFBPage;

	@Step
	public void login(String email, String pwd) {
		onAuthenFBPage.enterEmail(email);
		onAuthenFBPage.enterPassword(pwd);
	}

	@Step
	public void loginEmptyEmail(String pwd) {
		onAuthenFBPage.clearEmail();
		onAuthenFBPage.enterPassword(pwd);
	}

	@Step
	public void loginEmptyPwd(String email) {
		onAuthenFBPage.enterEmail(email);
		onAuthenFBPage.clearPassword();
	}

	@Step
	public void loginEmptyAc() {
		onAuthenFBPage.clearEmail();
		onAuthenFBPage.clearPassword();
	}

	@Step
	public void clickOnLoginBt() {
		onAuthenFBPage.clickOnLoginBt();
	}

	@Step
	public void clickOnForgetAc() {
		onAuthenFBPage.clickOnLinkTextFogotPassword();
	}

	@Step
	public void clickOnNewAc() {
		onAuthenFBPage.clickOnNewAccountFBBt();
	}
}
