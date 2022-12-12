package shop1aTesting.launcher;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
features ={"src/test/resources/features"},
glue ={"shop1aTesting/steps"},
tags ="@CartTest")
public class shop1aTestLauncher {
}
