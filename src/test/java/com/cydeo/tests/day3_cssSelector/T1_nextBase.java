package com.cydeo.tests.day3_cssSelector;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_nextBase {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

         WebElement loginButton = driver.findElement(By.className("login-btn"));
         loginButton.click();

         WebElement errorMessage = driver.findElement(By.className("errortext"));

         String expectedErrorMessage ="Incorrect login or password";
         String actualErrorMessage = errorMessage.getText();

         if(actualErrorMessage.equals(expectedErrorMessage)){
              System.out.println("Error message verification Passed!");
         }else{
             System.out.println("Error message verification Failed!");
         }

         //driver.close();
    }

}



/*
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */