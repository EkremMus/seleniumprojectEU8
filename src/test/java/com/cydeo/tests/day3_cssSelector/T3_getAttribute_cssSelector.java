package com.cydeo.tests.day3_cssSelector;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/");

        //WebElement signInButton = driver.findElement(By.className("login-btn"));
                //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));

        WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));
        String expectedButtonText = "Log In";

        String actualButtonText = signInButton.getAttribute("value");

        System.out.println("actualButtonText = " + actualButtonText);

        if(actualButtonText.equals(expectedButtonText)){
            System.out.println("LogIn Button text verification is passed!");
        }else{
            System.out.println("LogIn Button text verification is failed!");
        }

        driver.close();


    }

}

/*
TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “Log in” button text is as expected:
Expected: Log In
 */