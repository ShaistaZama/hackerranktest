package com.hackerrank.selenium;

import org.openqa.selenium.WebDriver;

public class WebAuthenticator {

    public static String authenticateAndGetText(WebDriver driver, String pageUrl) {
        // complete implementation, authentication and return body text.
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        return a;
    }
}
