package uk.co.library.testsuite.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobSearchSteps {
    @Given("I am on Home Page")
    public void iAmOnHomePage() {
    }

    @When("I enter job title {string}")
    public void iEnterJobTitle(String arg0) {
    }

    @And("I enter location {string}")
    public void iEnterLocation(String arg0) {
    }

    @And("I select distance {string}")
    public void iSelectDistance(String arg0) {
    }

    @Then("I click on moreSearchOptions Link")
    public void iClickOnMoreSearchOptionsLink() {
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String arg0) {
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String arg0) {
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String arg0) {
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String arg0) {
    }

    @Then("I click on Find Jobs button")
    public void iClickOnFindJobsButton() {
    }

    @And("I verify the result {string}")
    public void iVerifyTheResult(String arg0) {
    }
}
