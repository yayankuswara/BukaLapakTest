package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BLContext {
		
	@Given("^I got data from Transaction Page$")
	public void I_got_data_from_Transaction_Page() throws Throwable {
		Transaction transaction = new Transaction();
			transaction.getDataUi();
	}
	
	@When("^Check with Database$")
	public void Check_with_Database() throws Throwable {
		Transaction transaction = new Transaction();
		transaction.getDataTransaction();
	}
	
	@Then("^Match the Transaction ID$")
	public void Match_the_Transaction_ID() throws Throwable {
		Transaction transaction = new Transaction();
		transaction.getIndexMatch(transaction.getDataUi()[0], transaction.getDataTransaction());
	}
	
	@Then("^Match all data$")
	public void Match_all_data(String[] getDataUi, String[] getIndexMatch) throws Throwable {
		Transaction transaction = new Transaction();
		transaction.matchData(getDataUi, getIndexMatch);
	}
}
