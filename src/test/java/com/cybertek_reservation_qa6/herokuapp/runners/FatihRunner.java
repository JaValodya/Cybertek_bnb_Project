package com.cybertek_reservation_qa6.herokuapp.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
		
		tags="@db",
		features="src/test/resources/com/cybertek_reservation_qa6/herokuapp/features", 
		glue="com/cybertek_reservation_qa6/herokuapp/step_definitions"
		,dryRun = false
		)
public class FatihRunner {}
