package com.assessment.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.ClickAction;

import com.assessment.selenium.Executor;
import com.assessment.selenium.SeleniumExecutor;

import static org.junit.Assert.assertEquals;


public class SeleniumExecutorTest extends BaseSeleniumTest {

    private static final String LOGIN = "test@devskiller.com";
    private static final String PASSWORD = "DevSkill1!";

    @Test
    public void MultifactorAuthenticationLogin() {
    	 webDriver.get("http://localhost:8089/index.html");
         
        Executor executor = new SeleniumExecutor(webDriver);

        // Page 1
        executor.SetLoginAndClickNext(LOGIN);

        // Page 2
        String code = executor.OpenCodePageAndReturnCode();
        executor.SetCodeAndClickNext(code);   
        assertEquals(executor.GetCodeToAssert(), code);

        
        // Page 3
        executor.FillMaskedPasswordAndClickLogin(PASSWORD);
        String text = executor.GetLoggedInText();
        assertEquals(executor.GetTextToAssert(), text);
    }
}
