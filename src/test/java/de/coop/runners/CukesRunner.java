package de.coop.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*  This class allows us
    - to run our code
    - to create connection between the packages by using "features and glue" (features-step_definitions)
    - to create a cucumber report by using "plugin"
    - to create undefined steps in our scenario by using "dryRun" (it must be true for that)
    - to run scenarios which we would like to run by using "tags"
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                 "html:target/default-html-reports",
                 "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "de/coop/step_definitions",
        dryRun = false,
        tags = "@wip"

)
public class CukesRunner {
}
