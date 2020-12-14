package StepExecution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/Feature/CraeteClass.feature",glue="StepDefination")
public class TestRunner extends AbstractTestNGCucumberTests {

}