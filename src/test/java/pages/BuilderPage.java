package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuilderPage extends BaseClass {
	private static final String String = null;
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BuilderPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		wait= new WebDriverWait(driver,Duration.ofSeconds(15000));
	}
	
@FindBy( xpath="(//div[@class='group-item ']//a[contains(text(), 'Change')])[2]")
WebElement changebutton;
@FindBy( xpath="//div[@class=\"row  align-items-center\"]")
WebElement Modifieritem;

@FindBy(xpath="//a[text()='Customize']")
WebElement ModifierCustomization;
@FindBy(xpath="(//button[@class='btn white ng-binding'])[1]")
WebElement ModifierItemSelection;
@FindBy(xpath="(//button[text()='Confirm'])[2]")
WebElement ModifierConfirmation;
@FindBy(xpath="(//button[@class=\"aRemoveItem\"])[2]")
WebElement ModifierPopupClose;



public void GetChangeLink() {
	
	changebutton.click();
	if(changebutton.isSelected())
		System.out.println("Element is clicked");
}
public void SubModifierSelection() {
	Modifieritem.click();
	
	if(Modifieritem.isSelected())
	 System.out.println("modifier item is selected");
	else
		System.out.println("Modifier item is not selected");
	
}
public void modifierCustimization() {
	ModifierCustomization.click();
	
}
public void modifierItemselection() {
	ModifierItemSelection.click();
	
}
public void modifierItemcomfirm() {
	ModifierConfirmation.click();
	
}
public void modifierPopupClose() {
	ModifierPopupClose.click();
	
}

}
