package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//WebElement element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")); //szukanie po XPath

public class SearchResultPage extends BasePage {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
    By resultBy = By.xpath("//*[@id=\"cwos\"]");//adres pola z wynikiem
    By searchInputBy = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div/div[2]/input");//adres pola do szukania

    public SearchResultPage verify(String expected){
        assertEquals(resultBy, expected); //porownanie wynikow
        return this;
    }
    public SearchResultPage search(String text){
        clearText(searchInputBy); //czyszczenie pola tekstowego
        writeText(searchInputBy, text); //wpisanie nowego tekstu w pole
        submitForm(searchInputBy); //szukaj!
        return new SearchResultPage(driver);
    }
}
