package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.AuthenGoogleEmailPage;

public class AuthenGoogleEmailSteps {
	AuthenGoogleEmailPage onAuthenGoogleEmailPage;

	@Step
	public void sendEmail(String email) {
		onAuthenGoogleEmailPage.enterEmail(email);
	}
	public void sendEmtyEmail() {
		onAuthenGoogleEmailPage.clearEmail();
	}
	@Step
	public void clickOnContinueToAuthen() {
		onAuthenGoogleEmailPage.clickOnContinueBt();
	}
	@Step
	public void clickOnCreateAc() {
		onAuthenGoogleEmailPage.clickOnLinkTextCreateNewAccount();
	}
	@Step
	public void clickOnForgetAc() {
		onAuthenGoogleEmailPage.clickOnlinkTextForgetEmail();
	}
}
