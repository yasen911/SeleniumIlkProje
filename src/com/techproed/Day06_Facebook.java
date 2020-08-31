package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        // 1. Adim
        // email kutusuna techproed yazdiralim

        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("techproed@gmail.com");

        // 2. Adim
        // sifre kutusuna Test1234 yazdiralim
        WebElement sifreKutusu = driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");
        sifreKutusu.submit();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }


        String logUrl = driver.getCurrentUrl();
        System.out.println(logUrl);
        if(logUrl.equals("https://com.facebook.com/login/")) {
            System.out.println("Basarili");
        }else {
            System.out.println("Basarisiz");
        }
   driver.quit();

    }

}
