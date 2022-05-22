package Runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.junit.AfterClass;

@CucumberOptions(

        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"},
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false
)


public class RunnerGenel extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("/Users/aysenurkaya/IdeaProjects/CikolataSepetiProject/target/ExtentReport/ExtentReportRegression.html");

        Reporter.setSystemInfo("QA Tester : ", "Ezgi Babataş");
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }

}
