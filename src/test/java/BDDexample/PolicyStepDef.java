package BDDexample;

import cucumber.api.PendingException;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class PolicyStepDef {
    private String firstName;
    private String lastName;
    private int policyNumber;
    PolicyDetails myPolicy = new PolicyDetails();
    private int age;
    private String emailAddress;

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

    @When("^I ask for my policy number$")
    public void iAskForMyPolicyNumber() {
        policyNumber = myPolicy.getPolicyNumber();

    }

    @Then("^I get my policy number$")
    public void iGetMyPolicyNumber() {
        assertEquals(123456, policyNumber);
    }

    @When("^I ask for my age$")
    public void iAskForMyAge() {
        age = myPolicy.getAge();
    }

    @Then("^I get my age$")
    public void iGetMyAge() {
        assertEquals(20, age);
    }

    @When("^I ask for my email address$")
    public void iAskForMyEmailAddress(){
        emailAddress = myPolicy.getEmailAddress();
    }

    @Then("^I get my email address$")
    public void iGetMyEmailAddress() {
        assertEquals("blah@blah.com", emailAddress);
    }

    @When("^I ask for all my policy details$")
    public void iAskForAllMyPolicyDetails() {
        firstName = myPolicy.getFirstName();
        lastName = myPolicy.getLastName();
        policyNumber = myPolicy.getPolicyNumber();
        age = myPolicy.getAge();
        emailAddress = myPolicy.getEmailAddress();
    }

    @When("^I ask for my personal details$")
    public void iAskForMyPersonalDetails() {
        firstName = myPolicy.getFirstName();
        lastName = myPolicy.getLastName();
        age = myPolicy.getAge();
        emailAddress = myPolicy.getEmailAddress();
    }

    @But("^I don't get my policy number$")
    public void iDonTGetMyPolicyNumber() {
        assertEquals(0, policyNumber);
    }
}
