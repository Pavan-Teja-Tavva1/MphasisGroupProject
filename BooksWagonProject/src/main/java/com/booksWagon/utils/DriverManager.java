package com.booksWagon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {
	 private static WebDriver driver;


	    private DriverManager() { } // Private constructor to prevent instantiation

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            driver = new EdgeDriver();
	        }
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
}
