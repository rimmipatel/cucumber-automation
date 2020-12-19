package com.sample.home;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    private final HomePage homePage;

    public HomeSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("Step One")
    public void stepOne() {
        System.out.println("Step 1");
    }

    @When("Step Two")
    public void stepTwo() {
        System.out.println("Step 2");
    }
}
