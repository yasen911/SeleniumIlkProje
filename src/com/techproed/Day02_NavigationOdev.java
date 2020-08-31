package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://google.com");
        webDriver.navigate().to("https://youtube.com");

        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();





    }
}
