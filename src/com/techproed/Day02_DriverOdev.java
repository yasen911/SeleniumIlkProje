package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://google.com");
        webDriver.get("https://youtube.com");

        String sayfaTitle = webDriver.getTitle();
        System.out.println(sayfaTitle);

        String sayfaUrl = webDriver.getCurrentUrl();
        System.out.println(sayfaUrl);

        webDriver.navigate().back();
        String UrlGoogle = webDriver.getCurrentUrl();

        webDriver.quit();






    }
}
