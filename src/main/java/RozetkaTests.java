import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RozetkaTests {
    @Test
    public void searchTest() {
        System.setProperty("webdriver.chrome.driver","D:\\LEARNING\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone 12");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);
        driver.quit();

    }
    @Test
    public  void sortTest(){
        System.setProperty("webdriver.chrome.driver","D:\\LEARNING\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone 12");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("/html/body/app-root/div/div/rz-search/rz-catalog/div/div[1]/div/rz-sort/select")).click();
        driver.findElement(By.xpath("/html/body/app-root/div/div/rz-search/rz-catalog/div/div[1]/div/rz-sort/select/option[2]")).click();
        driver.quit();

    }


    @Test
    public  void addToCart() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\LEARNING\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone 12");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html//app-goods-tile-default/div/div[2]/div[4]/div[2]/app-buy-button/button")).click();
    }
    @Test
    public void filters(){
        System.setProperty("webdriver.chrome.driver","D:\\LEARNING\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iPhone 12");
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//label[@for='Apple']")).click();
    }

    @Test
    public void changeLanguage(){
        System.setProperty("webdriver.chrome.driver","D:\\LEARNING\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        driver.findElement(By.xpath("//a[@class='lang__link ng-star-inserted']")).click();

    }


}
