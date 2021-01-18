package co.com.reto.utest.stepdefinitions;

import co.com.reto.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^than Luz wants be a freelance software tester on Utest web page$")
    public void thanLuzWantsBeAFreelanceSoftwareTesterOnUtestWebPage() {
        OnStage.theActorCalled("Luz").wasAbleTo(OpenUp.thePage());

    }

    @When("^she Diligence the differents registration forms on Utest web page$")
    public void sheDiligenceTheDifferentsRegistrationFormsOnUtestWebPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(DiligencePerson.onTheForm(), DiligenceAdress.onTheForm(), DiligenceDevices.onTheForm(), DiligencePassword.onTheForm());

    }

    @Then("^she is successfully registered on the Utest's platform$")
    public void sheIsSuccessfullyRegisteredOnTheUtestPlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(Complete.theRegister());
    }
}
