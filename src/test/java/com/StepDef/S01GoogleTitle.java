package com.StepDef;

import io.cucumber.java.en.*;


public class S01GoogleTitle {
	@Given("Open Google")
	public void open_google() {
	   System.out.println("Launching Google");
	}

	@When("Read the title of page")
	public void read_the_title_of_page() {
		 System.out.println("Reading the title of page");
	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		 System.out.println("Validating the title");
	}
	}



