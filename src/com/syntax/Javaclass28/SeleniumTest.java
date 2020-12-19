package com.syntax.Javaclass28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Juan\\Downloads\\chromedriver_win32.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.amazon.com/");
    }
}
