package vn.edu.elight.pages;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import vn.edu.elight.steps.LoginSteps;

@RunWith(SerenityRunner.class)

public class TestRunner {
	String email = "tranvan.humg@gmail.com";
	String pwd = "";

	@Steps
	LoginSteps testerLoginSteps;

	@Test

	public void loginWithFBAc() {
		testerLoginSteps.login(email, pwd);
		testerLoginSteps.clickOnLoginBt();
	}

}
