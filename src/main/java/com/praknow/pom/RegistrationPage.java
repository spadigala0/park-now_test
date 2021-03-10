/*
 * Swash Tech Ltd.
 *
 * RegistrationPage.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.praknow.pom;

import com.praknow.base.BasePage;
import com.praknow.utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// ---- Import Statements -----------------------------------------------------
public class RegistrationPage extends BasePage {

    @FindBy(id = "field-Member_CLI")
    private WebElement mobileNumber;
    @FindBy(id = "field-Member_Email")
    private WebElement email;
    @FindBy(id = "field-MemberPassword")
    private WebElement password;
    @FindBy(xpath = "//input[@name='Marketing']")
    private WebElement marketingChk;
    @FindBy(xpath = "//input[@name='DataSharing']")
    private WebElement dataSharingChk;
    @FindBy(xpath = "//div[@class='g-recaptcha']")
    private WebElement captcha;
    @FindBy(xpath = "//input[@name='terms']")
    private WebElement terms;
    @FindBy(id = "labyrinth_UserDetails_next")
    private WebElement next;
    @FindBy(css = "div[class='element div-Member_CLI error'] span[class='error']")
    private WebElement mobileError;
    @FindBy(css = "div[class='element div-Member_Email error'] span[class='error']")
    private WebElement emailError;
    @FindBy(css = "div[class='element div-MemberPassword error'] span[class='error']")
    private WebElement passwordError;
    @FindBy(css = "ul.warning-notification:nth-child(1) > p")
    private  WebElement pageWarning;
    @FindBy(xpath = "//span[normalize-space()='You must agree to the Terms & Conditions']")
    private WebElement tncErrorMessage;

    public void navigateToPortal() {
        driver.get(Utils.getEnvironmentURL());
    }


    public void enterMobileNumber(String mobileNo) {
        mobileNumber.sendKeys(mobileNo);
    }

    public void enterEmail(String userEmail) {
        email.sendKeys(userEmail);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }

    public void clickMarketingCheckBox() {
        marketingChk.click();
    }

    public void clickCaptcha() {
        captcha.click();
    }

    public void clickTermsCheckBox() {
        terms.click();
    }

    public void clickDataSharingCheckBox() {
        dataSharingChk.click();
    }

    public void clickNext() {
        next.click();
    }

    public String getMobileError() {
        return mobileError.getText();
    }
   public String getEmailError() {
        return emailError.getText();
    }
   public String getPasswordError() {
        return passwordError.getText();
    }

    public String getPageWarning(){
        return pageWarning.getText();
    }
    public String getTncErrorMessage(){
        return tncErrorMessage.getText();
    }


}
