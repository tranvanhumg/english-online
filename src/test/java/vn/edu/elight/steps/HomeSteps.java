package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.HomePage;

public class HomeSteps {
	HomePage onHomePage;

	@Step
	public void clickToLogin() {
		onHomePage.clickOnLoginButton();
	}
}
