package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutInformationPage extends BasePage {
    private By firstnameField = By.id("first-name");
    private By lastnameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By finishButton = By.id("finish");
    private By menuButton = By.id("react-burger-menu-btn");

    public CheckOutInformationPage(WebDriver webDriver){
        super(webDriver);
    }
public WebElement getFirstnameField (){
        return getWebDriver().findElement(firstnameField);
}
public WebElement getLastnameField (){
        return getWebDriver().findElement(lastnameField);
}
public WebElement getPostalCodeField(){
        return getWebDriver().findElement(postalCodeField);
}
public WebElement getContinueButton (){
        return getWebDriver().findElement(continueButton);
}
public WebElement getFinishButton (){
        return getWebDriver().findElement(finishButton);
}
public Select getMenuButton (){
        WebElement menuButtonElement =getWebDriver().findElement(menuButton);
        Select selectMenuButton = new Select(menuButtonElement);
        return selectMenuButton;
}
public void confirmShop (String firstname, String lastname, String postalcode){
        getFirstnameField().sendKeys(firstname);
        getLastnameField().sendKeys(lastname);
        getPostalCodeField().sendKeys(postalcode);
        getContinueButton().click();
        getFinishButton().click();

}

}
