package BDDexample;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class PolicyStepDef {
    private String firstName;
    private String lastName;
    PolicyDetails myPolicy = new PolicyDetails();

    @When("^Give me name$")
    public void Give_me_name(){
        myPolicy.getFirstName();
        myPolicy.getLastName();
    }


    @Given("^policy details$")
    public void policyDetails() {
        myPolicy.setAge(20);
        myPolicy.setEmailAdress("blah@blah.com");
        myPolicy.setFirstName("Brian");
        myPolicy.setLastName("May");
        myPolicy.setPolicyNumber(123456);
    }

    @When("^I ask for my name$")
    public void iAskForMyName(){
        firstName = myPolicy.getFirstName();
        lastName = myPolicy.getLastName();
    }

    @Then("^I get my full name$")
    public void iGetMyFullName(){
        assertEquals ("Brian", firstName);
        assertEquals ("May", lastName);
    }
}
