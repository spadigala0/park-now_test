/*
 * Swash Tech Ltd.
 *
 * RegistrationStepdefs.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.parknow.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

// ---- Import Statements -----------------------------------------------------
public class RegistrationStepdefs extends BaseStepdefs {
    @Given("Navigated to environment")
    public void navigatedToEnvironment() {

        registrationPage.navigateToPortal();
    }

    @And("Accept Cookies")
    public void acceptCookies() {
        registrationPage.acceptCookies();
    }

    @Given("enter mobile number")
    public void enterMobileNumber() {
        registrationPage.enterMobileNumber(RandomStringUtils.random(10, false, true));
        System.out.println("Enter mobile number");
    }

    @When("enter email id")
    public void enterEmailId() {
        registrationPage.enterEmail(RandomStringUtils.randomAlphanumeric(16) + "@gmail.com");
    }

    @And("enter password {string}")
    public void enterPassword(String arg0) {
        registrationPage.enterPassword(arg0);
    }

    @And("click on update buttons")
    public void clickOnUpdateButtons() {
        registrationPage.clickMarketingCheckBox();
        registrationPage.clickDataSharingCheckBox();
    }

    @And("click on captcha and terms and conditions")
    public void clickOnCaptchaAndTermsAndConditions() {
        registrationPage.clickTermsCheckBox();
        // registrationPage.clickCaptcha();

    }

    @And("click on next")
    public void clickOnNext() {
        registrationPage.clickNext();

    }

    @Then("show warning message")
    public void showWarningMessage() {
        Assert.assertEquals("There is an error in the form. Please check for details below."
                , registrationPage.getPageWarning());
    }


    @Given("enter invalid mobile number {string}")
    public void enterInvalidMobileNumber(String arg0) {
        registrationPage.enterMobileNumber(arg0);
    }


    @Then("validate error message {string} for invalid mobile number")
    public void validateErrorMessageForInvalidMobileNumber(String arg0) {
        Assert.assertEquals(arg0, registrationPage.getMobileError());

    }

    @When("enter email id {string}")
    public void enterEmailId(String arg0) {
        registrationPage.enterEmail(arg0);
    }

    @Then("validate error messages {string},{string},{string}")
    public void validateErrorMessages(String arg0, String arg1, String arg2) {
        Assert.assertEquals(arg0, registrationPage.getMobileError());
        Assert.assertEquals(arg1, registrationPage.getEmailError());
        Assert.assertEquals(arg2, registrationPage.getPasswordError());

    }

    @Then("show error message {string}")
    public void showErrorMessage(String arg0) {
      Assert.assertEquals(arg0, registrationPage.getTncErrorMessage());
    }

    @Then("should navigate to verify code page")
    public void shouldNavigateToVerifyCodePage() {
        //TODO: To complete
    }
}
