package sda.webdriver;


import Pages.AutomationPractice;
import Pages.HomeAllegro;
import Pages.HomePage;
import Pages.SearchResultPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import sun.jvm.hotspot.utilities.soql.JSJavaScriptEngine;

import static org.assertj.core.api.Assertions.assertThat;

public class MyFirstTest {
    public WebDriver driver;


    @Before
    public void DriverStart() {
        System.out.println("Test start");
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void CloseDriver() {
        System.out.println("Driver Stop");
        driver.quit();
    }


   /* @Test
    public void JakisTest() {


        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")); /szukanie po XPath
        //driver.findElement(By.name("q"); //szukanie po nazwie elementu


        element.sendKeys("Software Development Academy"); /wyślij tekst do elementu


        element.submit(); // zatwierdź wysłany tekst

        String pageTittle = driver.getTitle(); //sprawdź tytuł strony i zapisz go do zmiennej
        String expectedTittle = "Software Development Academy - Szukaj w Google"; //deklaracja zmiennej zawierającej tytuł trony

        assertThat(pageTittle).isEqualTo(expectedTittle); //sprawdzenie czy zawartość zmiennej jest róna tytułowi trony

        element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("bigos");
        element.submit();

        driver.quit();








    }

    @Test
    public void kalulatorTest(){

        HomePage strona = new HomePage(driver);
        SearchResultPage wynik = strona.goToHomepage().search("5+2").verify("7");


    }
    @Test
    public void kalulatorTest2(){

        HomePage strona = new HomePage(driver);
        SearchResultPage wynik = strona.goToHomepage()
                .search("5-2")
                .verify("3");

    }
    @Test
    public void allegro(){

        HomeAllegro allegro = new HomeAllegro(driver);
        allegro.goToHomepage().search("nic");

    }*/

    @Test
    public void basketVisibilityTest(){

        AutomationPractice testKoszyka = new AutomationPractice(driver);
        testKoszyka.goToHomepage("http://automationpractice.com/");
                testKoszyka.checkForVisibility();
                //testKoszyka.firstSurf();
                //testKoszyka.checkForVisibility();


    }






}
