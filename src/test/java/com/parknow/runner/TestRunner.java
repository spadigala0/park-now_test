/*
 * Swash Tech Ltd.
 *
 * TestRunner.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.parknow.runner;

// ---- Import Statements -----------------------------------------------------

import com.praknow.base.BrowserFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.parknow.stepdefs"},
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
@RunWith(Cucumber.class)
public class TestRunner {
    @AfterClass
    public static void tearDown() {
        BrowserFactory.tearDown();
    }
}
