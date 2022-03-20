package stepdefs;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CucumberDemoStepDef {

    @BeforeStep
    public void beforeStep() {
        System.out.println("BEFORE STEP");
        System.out.println("===============");
        System.out.println();
    }

    @AfterStep
    public void afterStep() {
        System.out.println("AFTER STEP");
        System.out.println("===============");
        System.out.println();
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("INITIALISATION");
        System.out.println("===============");
        System.out.println();
    }


    @Before
    public void setUp() {
        System.out.println("DOING SETUP");
        System.out.println("===============");
        System.out.println();
    }

    @Given("I enter my user name and password {string}")
    public void iEnterMyUserNameAndPassword(String UserName) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Inside Given ---- ");
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        System.out.println("Inside When ---- ");
    }

    @Then("I see the landing page")
    public void iSeeTheLandingPage() {
        System.out.println("Inside Then ---- ");
        Assert.assertEquals(2, 2);
    }

    @After
    public void cleanUp() {
        System.out.println();
        System.out.println("DOING CLEANUP");
        System.out.println("===============");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("INITIALISATION");
        System.out.println("===============");
        System.out.println();
    }
}
