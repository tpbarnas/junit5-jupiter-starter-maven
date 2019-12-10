package Pages;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPractice extends BasePage {


    public AutomationPractice(WebDriver driver) {
        super(driver);
    }

    By koszyk = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    By firstSurf = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a");
    //By secondSurf = By.xpath("");



    public AutomationPractice goToHomepage(String adres) {
        driver.get(adres);
        return this;
    }

    public void checkForVisibility(){
        driver.findElement(koszyk);
    }
    public void firstSurf(){
                driver.findElement(firstSurf).click();
   }
}
