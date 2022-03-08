package com.simplilearn.mavenproject;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private WebDriver driver;
    private String url;
    private String expectedTitle;
    
    @BeforeEach
    public void before()
    {
    	driver= new ChromeDriver();
    	url = "https://www.google.com";
    	expectedTitle = "Google";
    	driver.navigate().to(url);
    }
    
    
    @Test
    public void shouldAnswerWithTrue()
    {
        String actualtitle = driver.getTitle();
        assertEquals(actualtitle, expectedTitle);
    }
    
    @AfterEach
    public void closeBrowser()
    {
    	driver.close();
    }
}
