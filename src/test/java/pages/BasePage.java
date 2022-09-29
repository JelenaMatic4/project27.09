package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private WebDriver webDriver;

    public BasePage(WebDriver webDriver){

    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
