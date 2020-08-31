package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("https://google.com");
        WebElement aramaKutusu = webDriver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();
        WebElement sonucSayisi = webDriver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        WebElement shoppingLinki = webDriver.findElement(By.partialLinkText("Shopping"));
        shoppingLinki.click();

    }




}
