package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage (WebDriver webDriver){
        super(webDriver);
    }
    public WebElement getUsernameField(){
        return getWebDriver().findElement(usernameField);
    }
    public WebElement getPasswordField(){
        return getWebDriver().findElement(passwordField);
    }
    public WebElement getLoginButton(){
        return getWebDriver().findElement(loginButton);
    }
    public void login(String username, String password){
        getUsernameField().clear();
        getPasswordField().clear();
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();

    }
}
