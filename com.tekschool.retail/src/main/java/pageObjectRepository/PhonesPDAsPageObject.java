package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {

	public PhonesPDAsPageObject () {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'HTC Touch HD')]")
	private WebElement htctouchhd; 
	
	@FindBy(xpath = "//h2[contains(text(),'$123.20')]")
	private WebElement $123;
	
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	private WebElement review;

}
