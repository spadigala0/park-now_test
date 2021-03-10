/*
 * Swash Tech Ltd.
 *
 * Utils.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.praknow.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

// ---- Import Statements -----------------------------------------------------
public class Utils {
    public static String baseURI;

    public static void waitForPageLoadAndImplicitWait(WebDriver driver, int pageWait, int implicitWait) {

        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(implicitWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
    }

    public static String getEnvironmentURL() {

        String environment = System.getProperty("environment", "TEST");
        switch (environment.toUpperCase()) {
            case "DEV":
                return "http://myRingGoTest:W4t3Rf4lls@myrgo-dev.ctt.co.uk/register";
            case "TEST":
                return "http://myRingGoTest:W4t3Rf4lls@myrgo-preprod.ctt.co.uk/register";
            default:
                throw new IllegalArgumentException("Invalid Environment");
        }
    }

    public static void findWebElementAndClick(WebDriver driver, By by) {
        WebElement webElement = driver.findElement(by);
        webElement.click();
    }

    public static void findWebElementAndEnterText(WebDriver driver, By by, String value) {
        WebElement webElement = driver.findElement(by);
        webElement.sendKeys(value);
    }


}
