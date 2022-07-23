package CucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

   @CucumberOptions(features= "src/test/java/Feature",
                    glue= "stepDefination",dryRun = false , monochrome = true )

public class TestNGtestRunner extends AbstractTestNGCucumberTests{

	
}
