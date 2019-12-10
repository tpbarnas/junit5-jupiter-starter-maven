package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeAllegro extends BasePage {

    public HomeAllegro(WebDriver driver) {

        super(driver);
    }
    By inputBy = By.xpath("/html/body/div[2]/div[3]/nav/div/div[1]/div/div/form/input");
    By cookieClose = By.xpath("/html/body/div[2]/div[8]/div/div[2]/div/div/button/img");

    public HomeAllegro goToHomepage(){
        driver.get("https://allegro.pl/");// idź do strony allegro.pl
        waitVisibility(cookieClose); //poczekaj na widoczność cookie
        driver.findElement(cookieClose).click(); // kliknij X aby zamknąć cookie
        return this; // zwróć akltualny stan HomeAllegro
    }


    public SearchResultPage search(String text){

        writeText(inputBy, text); //w miejscu wskazanym prze zmienną inputBy wpisz zmienną text
        submitForm(inputBy); // kliknij szukaj

        return new SearchResultPage(driver); // zwróć parametry SearchResultPage
    }
}
