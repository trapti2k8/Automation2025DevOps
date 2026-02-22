package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05AmzonTitle {
	WebDriver driver;
	@Given("Launch Amazon site")
	public void launch_amazon_site() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().deleteAllCookies();
	    driver.get("https://www.amazon.nl/");
	    }
	   
	    @When("click on BestSellers Link")
        public void click_on_link_best_sellers_link() {
	    	driver.findElement(By.partialLinkText("Best")).click();
        }

        @Then("BestSellers page should open")
        public void best_sellers_page_should_open() {
        	System.out.println("Title :" + driver.getTitle());
        }

        @When("click on Today's Deals Link")
        public void click_on_link_today_s_deals() {
        	driver.findElement(By.partialLinkText("Deals")).click();

         }

        @Then("Today's Deals page should open")
        public void today_s_deals_page_should_open() {
            System.out.println("Title :" + driver.getTitle());
        }

        @When("click on link Prime Link")
        public void click_on_link_prime_link() {
        	driver.findElement(By.partialLinkText("Prime")).click();
        	
       }

        @Then("Prime  page should open")
        public void prime_page_should_open() {
        	 System.out.println("Title :" + driver.getTitle());  
        }

        @When("Click on  Gift Cards link")
        public void click_on_gift_cards_link() {
        	driver.findElement(By.partialLinkText("Cards")).click();
        }

        @Then("Gift Cards page should open")
        public void gift_cards_page_should_open() {
        	 System.out.println("Title :" + driver.getTitle());
        }

	}
	