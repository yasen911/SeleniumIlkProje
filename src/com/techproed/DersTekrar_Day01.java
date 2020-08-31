package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DersTekrar_Day01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");

        driver.navigate().to("http://amazon.com");

        String amazonTitle = driver.getTitle() ;

        if (amazonTitle.contains("Car")){
            System.out.println("sayfa basligi geciyor" + amazonTitle);
        }else {
            System.out.println("sayfabasligi gecmiyor" + amazonTitle);
        }




        String sayfaTitle1 = driver.getTitle();
        String sayfaTitle2 = driver.getTitle();
        driver.navigate().back();
        String sayfaUrl1 = driver.getCurrentUrl();
        driver.navigate().forward();
        String sayfaUrl2 = driver.getCurrentUrl();
        driver.navigate().refresh();
        System.out.println(sayfaTitle1);
        System.out.println(sayfaUrl1);
        System.out.println(sayfaTitle2);
        System.out.println(sayfaUrl2);

        driver.quit();




    }
}
