package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



    public class Day01_IlkDers {

        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");
            WebDriver webDriver = new ChromeDriver();

            webDriver.get("https://google.com");

            //selenium ile ilgili il kodumuz.
            //webDriver nesnesi oluşturarrak, chrome driverı kullanabilir hale getirdik.

            //driver'ımıza goole.com a gitmesini söyledik.
            //webDriver.get("https://google.com");
            //driverımızda açık olan pencereyi kapatır.
            //webDriver.close();
            //driverimi kople kaparıyor
            webDriver.quit();
        }
    }