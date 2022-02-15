package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {

	public SoftwarePageObject () {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[contains(text(),'Software')]")
	private WebElement software;
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement Continue;
	
	@FindBy(xpath = "//a[contains(text(),'Site Map')]")
	private WebElement Sitemap;
	
}
