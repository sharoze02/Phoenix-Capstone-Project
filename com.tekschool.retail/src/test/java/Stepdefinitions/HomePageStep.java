package Stepdefinitions;

import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.HomePageObject;

public class HomePageStep extends Base {
	
HomePageObject homePage = new HomePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
	}
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.choseEuroFromDropdown();
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homePage.currencyValueShouldChangeEuro();
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnShoppingCart();
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homePage.yourShoppingCartIsEmpteyMessage();
	}
	
}