import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "/Users/siddharth_patil/IdeaProjects/Practice/src/main/resources/CucumberDemo.feature",
        glue = "stepdefs",
        dryRun = false,
//        tags = "@FirstTest",
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
        }
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
