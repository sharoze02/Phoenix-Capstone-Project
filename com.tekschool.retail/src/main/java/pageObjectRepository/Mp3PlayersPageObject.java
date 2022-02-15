package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {

	public Mp3PlayersPageObject () {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Laptops & Notebooks (5)')]")
	private WebElement Laptopsnotebooks;
	
	@FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
	private WebElement HPLP3065;
	
	@FindBy(xpath = "//h3[contains(text(),'Available Options')]")
	private WebElement AvailableOptions;
	
}