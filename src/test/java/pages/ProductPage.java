package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{
    private By productList = By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/li");
    private By addToListButton = By.className("btn btn_primary btn_small btn_inventory");
    private By shoppingCartContainer = By.id("shopping_cart_container");

    private By checkOutButton = By.id("checkout");

    public ProductPage(WebDriver webDriver){
        super(webDriver);
    }
    public List getProductList(){
        return getWebDriver().findElements(productList);
    }
    public WebElement getAddToListButton (){
        return getWebDriver().findElement(addToListButton);
    }
    public WebElement getShoppingCartContainer(){
        return getWebDriver().findElement(shoppingCartContainer);
    }
    public WebElement getCheckOutButton(){
        return getWebDriver().findElement(checkOutButton);
    }
    public void addProduct(){
        List productList = getProductList();
        WebElement addToListButton = getAddToListButton();
        addToListButton.click();
    }
    public void container (){
        WebElement shoppingCartContainer = getShoppingCartContainer();
        shoppingCartContainer.click();
        WebElement checkOutButton = getCheckOutButton();
        checkOutButton.click();
    }
}
