/*
 * Swash Tech Ltd.
 *
 * BaseStepdef.java
 *
 * ©️ 2020 Swash Tech Ltd. All Rights Reserved
 *
 * Author: Swapna Padigala
 * Date  : 10/03/2021
 */
// ---- Package ---------------------------------------------------------------
package com.parknow.stepdefs;


import com.praknow.pom.RegistrationPage;

// ---- Import Statements -----------------------------------------------------
public class BaseStepdefs {
    protected RegistrationPage registrationPage;

    public BaseStepdefs() {
        registrationPage = new RegistrationPage();
    }
}
