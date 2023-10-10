package stepsDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class LaunchGoogle {
	
	
	
	@Given("Launch Google in the browser")
	public void launch_google_in_the_browser() {
	    System.out.println("Launching google");
	    Driver.getDriver().get("https://www.google.com/");
	}

}
