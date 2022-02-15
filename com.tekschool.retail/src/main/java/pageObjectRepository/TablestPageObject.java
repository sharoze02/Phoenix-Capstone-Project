package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObject extends Base {

	public TablestPageObject () {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[contains(text(),'Samsung Galaxy Tab 10.1, is the world’s thinnest t')]")
	private WebElement samsungalaxytab;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productcompare;
	
	@FindBy(xpath = "//h2[contains(text(),'Tablets')]")
	private WebElement tablets;

}
