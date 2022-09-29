package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckOutInformationPage;
import pages.LoginPage;
import pages.ProductPage;

public class TestShop {
    private LoginPage loginPage;
    private ProductPage productPage;
    private CheckOutInformationPage checkOutInformationPage;
    private WebDriver webDriver;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelena84\\Downloads\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(webDriver);
        productPage = new ProductPage(webDriver);
        checkOutInformationPage = new CheckOutInformationPage(webDriver);
    }
    @Test

    public void shopping (){
        loginPage.login("standard_user", "secret_sauce");



    }
    @AfterClass
    public void afterClass(){
        webDriver.quit();

    }
}
