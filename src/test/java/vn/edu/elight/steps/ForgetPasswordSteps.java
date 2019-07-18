package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.ForgetPasswordPage;

public class ForgetPasswordSteps {
	ForgetPasswordPage onForgetPasswordPage;

	@Step
	public void sendEmail(String email) {
		onForgetPasswordPage.enterEmail(email);
	}
	public void sendEmtyEmail() {
		onForgetPasswordPage.clearEmail();
	}
	@Step
	public void clickOnSendBt() {
		onForgetPasswordPage.clickOnSendBt();
	}
	@Step
	public void clickOnBackLoginPage() {
		onForgetPasswordPage.clickOnLinkTextBackLoginPage();
	}
}
