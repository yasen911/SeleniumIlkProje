package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        webDriver.manage().window().maximize();

        // webelementimizi id kullanarak bulduk.
        webDriver.get("http://a.testaddressbook.com/");

        WebElement signInLink = webDriver.findElement(By.id("sign-in"));
        // webelementimize tıkladık.
        signInLink.click();

        // emailKutusu'nun içerisine yazı gönderiyoruz
        WebElement emailKutusu = webDriver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifre kutusunu buluyor.
        WebElement sifreKutusu = webDriver.findElement(By.id("session_password"));

        // sifreKutusu'nun içerisine yazı gönderiyoruz
        sifreKutusu.sendKeys("Test1234!");

        // sign in butonunu buluyoruz. // name="commit"
        WebElement signINButonu = webDriver.findElement(By.name("commit"));
        signINButonu.click();

        String baslik = webDriver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giris Basarili");
        }else{
            System.out.println("Giris Basarisiz");
        }webDriver.quit();


    }

}
