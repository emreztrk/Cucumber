package Runners;

// bütün testleri çalıştırır

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = true // true olduğunda testi çalıştırmaz sadece feature lara
        // ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır.
)

public class _03_TestRunnerAll extends AbstractTestNGCucumberTests{
}
