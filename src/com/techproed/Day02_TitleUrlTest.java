package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://youtube.com");
        String sayfaTitle = driver.getTitle();

        if (sayfaTitle.contains("Video")){
            System.out.println("Var" + "SayfaTitle");
        }else {
            System.out.println("Yok" + "SayfaTitle");
        }
        driver.quit();
    }



}
