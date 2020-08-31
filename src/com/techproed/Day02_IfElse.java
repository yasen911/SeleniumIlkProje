import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/daspinar/Dokumente/Selenium Library/Drives/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        String sayfaBasligi = driver.getTitle();

        if (sayfaBasligi.toLowerCase().contains("Car")){
            System.out.println("Car kelimesi geciyor ");
        }else { System.out.println("Car kelimesi gecmiyor ");
        }
        driver.quit();
    }

}