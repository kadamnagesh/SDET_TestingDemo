package stepDefination;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class StepDefinations {

	 @Given("^User is on net banking landing page$")
	    public void user_is_on_net_banking_landing_page() throws Throwable {
	        //validate User is on net banking landing page
		 System.out.println("user landing on page");
	    }

	 @When("^User login into application with use \"([^\"]*)\" and pass \"([^\"]*)\"$")
	    public void user_login_into_application_with_use_something_and_pass_something(String strArg1, String strArg2) throws Throwable {
	      //  throw new PendingException();
		 System.out.println(strArg1);
		 System.out.println(strArg2);
	    }
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
	        System.out.println("browser is decided to run");
	    }

	    @When("^Browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	        System.out.println("browser is triggered");
	    }

	    @Then("^Check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	        System.out.println("browser is started");
	    }

	    @Then("^Home page papulated$")
	    public void home_page_papulated() throws Throwable {
	        // validate Home page papulated
	    	System.out.println("home page is displayed");
	    }
	   
	    @Then("card displyed are {string}")
	    public void card_displayed_are(String string) {
	       System.out.println(string);
	    }
	    @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
	    List<List<String>>obj= data.asLists();
	    System.out.println(obj.get(0).get(0));
	    System.out.println(obj.get(0).get(1));
	    System.out.println(obj.get(0).get(2));
	    System.out.println(obj.get(0).get(3));
	    System.out.println(obj.get(0).get(4));
}
	    @When("^User login in to application with use (.+) and pass (.+)$")
	    public void user_login_into_application_with_use_and_pass(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }
}