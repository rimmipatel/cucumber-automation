package com.sample.home;

import io.cucumber.java.en.Then;

public class SignInSteps {

    private final SignInPage signInPage;

    public SignInSteps(SignInPage signInPage) {
        this.signInPage = signInPage;
    }

    @Then("Step Three")
    public void stepThree() {
        System.out.println("Step 3");
    }
}
