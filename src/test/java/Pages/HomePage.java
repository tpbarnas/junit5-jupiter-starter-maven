package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }
    By inputBy = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");

    public HomePage goToHomepage(){
        driver.get("https://google.com");
        return this;
    }
    public SearchResultPage search(String text){

        writeText(inputBy, text);
        submitForm(inputBy);
        return new SearchResultPage(driver);
    }
}
