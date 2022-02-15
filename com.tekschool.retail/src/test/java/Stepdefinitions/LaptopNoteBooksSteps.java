package Stepdefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;

public class LaptopNoteBooksSteps extends Base {

	LaptopsNoteBooksPageObject laptopsNoteBooks = new LaptopsNoteBooksPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopsNoteBooks.clickOnLaptopNoteBookTab();
	}
	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopsNoteBooks.clickOnShowAllLaptopNoteBook();
	}
	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopsNoteBooks.clickOnMacBookItem();
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		laptopsNoteBooks.clickAddToCartButton();
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		laptopsNoteBooks.shouldSeeSuccessAddedMessage();
	}
	@And("User should see ‘{int} tem\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		laptopsNoteBooks.shouldSeeItemShowedToCart();
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopsNoteBooks.clickOnCartOption();
	}
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopsNoteBooks.clickOnRedXButton();
	}
	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		laptopsNoteBooks.itemShouldBeRemoved();
	}
	
	
	
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopsNoteBooks.clickOnProductComparisonIconMacBook();
	}
	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopsNoteBooks.clickOnProductComparisonIconMacBookAir();
	}
	@And("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		laptopsNoteBooks.shouldSeeMessageSuccessAddedMacbookAirToProductComparison();
	}
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopsNoteBooks.clickOnProductComparisonLink();
	}
	@And("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptopsNoteBooks.shouldSeeProductComparisonChart();
	}
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptopsNoteBooks.clickOnHeartIconToAddSonyToWishList();
	}
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		laptopsNoteBooks.shouldSeeMessageMustLoginOrCreateAnAccount();
	}
	@And("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptopsNoteBooks.clickOnMacBookProItem();
	}
	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptopsNoteBooks.shouldSeePriceTag();
	}
}

