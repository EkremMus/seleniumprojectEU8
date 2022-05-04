package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        driver.get("https://www.tesla.com");

        Thread.sleep(3000);

        String currentTittle = driver.getTitle();
        System.out.println("currentTittle = " + currentTittle);

        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        currentTittle = driver.getTitle();

        //System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("currentTittle = " + currentTittle);

        currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);

        driver.close();

        driver.quit();
    }
}
