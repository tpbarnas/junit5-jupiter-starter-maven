package Pages;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.WebDriver;

public class SearchResultAllegro extends BasePage {


    public SearchResultAllegro(WebDriver driver) {
        super(driver);
    }
    public SearchResultAllegro verify(String expected){

        String tittle = driver.getTitle();
        assertThat(tittle).isEqualTo(expected);

        return this;
    }
}
