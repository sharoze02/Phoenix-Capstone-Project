package Stepdefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.DesktopsPageObject;

public class DesktopsStep extends Base {
	
	DesktopsPageObject desktop = new DesktopsPageObject();

	
 // @Given("User is on Retail website")
	//public void user_is_on_retail_website() {}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktop.clickOnDesktop();
	}
	@And("User click on Show all desktops")
	public void user_clik_on_show_all_desktops() {
		desktop.clickOnShowAllDesktop();
	}
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktop.desktopPage();
	}
	
	@And("User click ADD TO CART option on 'HP LP3065' item")
	public void user_click_add_to_cart_option_on_hp_item() {
	desktop.clickOnAddToCartHP();
	}
	
	@And("User click ADD TO CART option on 'Canon EOS 5D' item")
	public void user_click_add_to_cart_option_on_canon_item() {
	desktop.clickOnAddToCartCanon();	}
	
	
	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktop.clickOnReviewLink();
		
	}
	
	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.enterYourName(data.get(0).get("yourName"));
		desktop.enterYourReview(data.get(0).get("yourReview"));
		desktop.enterRating(data.get(0).get("rating"));
	}
	
//	@And("User click add to Cart button")
	//public void user_click_add_to_cart_button() {
//	desktop.clickAddToCartButton();
	

	@Then("User should see a message")
	public void user_should_see_a_message() {
		desktop.shouldSeeAMessage();
	}
	
	
	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktop.selectQuantity();
	}
	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktop.clickOnAddToCartLaptop();
	}
	@Then("User should see a message ‘Success: you have added HP LP  to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
		desktop.shouldSeeAMessageLapTop();
	}
	@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktop.clickAddToCartCanonE();
	}
	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktop.selectColorDropDown();
	}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		desktop.shouldSeeAMessageCanonCart();
	}
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktop.clickOnCanonItem();
		
	}
	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktop.clickOnContinueButton();
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		desktop.shouldSeeAReviewMessage();
	}
}
