package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://google.com");
        webDriver.navigate().to("http://amazon.com");
        webDriver.navigate().back();
        webDriver.get("http://amazon.com");
        webDriver.navigate().forward();
        webDriver.navigate().refresh();

        String sayfaTitle = webDriver.getTitle();
        System.out.println(sayfaTitle);

        String sayfaUrl = webDriver.getCurrentUrl();
        System.out.println(sayfaUrl);

        webDriver.quit();


    }


}
