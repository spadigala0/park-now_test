/*
 * Swash Tech Ltd.
 *
 * BasePage.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.praknow.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

// ---- Import Statements -----------------------------------------------------
public class BasePage {
    public WebDriver driver;

    public BasePage() {
        this.setup();
    }

    public void setup() {
        this.driver = BrowserFactory.getWebDriver();
        PageFactory.initElements(driver, this);

    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void acceptCookies() {
        try {
            WebElement acceptCookies = driver.findElement(By.id("cookie-dismiss"));
            acceptCookies.click();
        } catch (Exception e) {
            System.out.println("Cookies already accepted");
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
