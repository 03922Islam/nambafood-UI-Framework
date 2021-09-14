package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty", // vydaet v formate HTML
                      "html:target/default-cucumber-reports", // vydaet cucumber
                      "json:target/cucumber.json"}, // budet davat' otchety JSON
            features = {"classpath:features"},
            glue = {"step_defs"},
            dryRun = false, // zapustit vse Testy
            tags = {"@Smoke"}
    )
    public class SmokeRunner{

    }

