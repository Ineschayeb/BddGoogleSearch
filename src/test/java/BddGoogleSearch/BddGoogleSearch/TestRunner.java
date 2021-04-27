package BddGoogleSearch.BddGoogleSearch;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
/*@CucumberOptions(
        features = { "classpath:features/resources/" },
        glue = {"bddbasics" })*/

@CucumberOptions(
        features = {"src/test/java/Features"},
        monochrome = true,
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
      //  plugin = { "pretty", "html:target/htmlreports" },
        glue = {"BddGoogleSearch.BddGoogleSearch"}

)

public class TestRunner {

}
