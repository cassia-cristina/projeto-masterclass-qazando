package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@login or @cadastro",
        plugin = {"json:target/reports/CucumberTests.json", "html:target/reports/report.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE, monochrome = true
)
public class RunnerCucumberTest {
}

