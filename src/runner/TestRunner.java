package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
features= {"E:\\Automate Learning\\src\\features\\Transaction.feature"},
glue= {"E:\\Automate Learning\\src\\stepDefinition"})
public class TestRunner {

}
