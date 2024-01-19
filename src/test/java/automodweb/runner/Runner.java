package automodweb.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {},
        features = "src/test/resources/features",
        glue ={"automodweb/stepDefinition", "automodweb/hooks"},
        tags = "@wip",
        dryRun = false,
        monochrome = true

)


public class Runner {
}
