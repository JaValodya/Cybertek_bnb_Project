package com.cybertek_reservation_qa6.herokuapp.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(plugin = { "pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json"

},

		tags = "@team", features = "src/test/resources/com/cybertek_reservation_qa6/herokuapp/features", glue = "com/cybertek_reservation_qa6/herokuapp/step_definitions", dryRun = false)
public class CukesRunner {
}
=======
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
		

		tags="@volodymyr",
		features="src/test/resources/com/cybertek_reservation_qa6/herokuapp/features", 
		glue="com/cybertek_reservation_qa6/herokuapp/step_definitions"
		,dryRun = true
		)
public class CukesRunner {}
>>>>>>> fb5a367e26ab4584cc6ac001397e37e5afb43ab9
