/*
 * Swash Tech Ltd.
 *
 * BrowserFactory.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.praknow.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

// ---- Import Statements -----------------------------------------------------
public class BrowserFactory {
    public static int IMPLICIT_WAIT = 3;
    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (driver == null) {
            String browser = System.getProperty("BROWSER", "CHROME");
            //We can use switch statement too.
            if (browser.equalsIgnoreCase("CHROME")) {
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-software-rasterizer");
                options.addArguments("--disable-blink-features=\"BlockCredentialedSubresources\"");
                options.addArguments("--no-proxy-server");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--ignore-certificate-errors");
                options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                driver = new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("FIREFOX")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
