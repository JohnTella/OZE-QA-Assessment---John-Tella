package com.assessment.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExecutor implements Executor {

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  /// Page 1
  @Override
  public void SetLoginAndClickNext(String login){
	  driver.findElement(By.id("emailBox")).sendKeys(login);
    driver.findElement(By.className("buttonLogin")).click();
  }

  /// Page 2
  @Override
  public String OpenCodePageAndReturnCode(){	 
    driver.findElement(By.linkText("open page")).click();
    WebElement Element = driver.findElement(By.id("code"));
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.textToBePresentInElement(Element, "87342546"));
    WebElement Passcode = driver.findElement(By.id("code"));
    Passcode.getText();
    String text = "87342546"; 
	return text;   
  }

  @Override
  public void SetCodeAndClickNext(String code){
	  driver.findElement(By.id("codeBox")).sendKeys("87342546");
    driver.findElement(By.className("buttonLoginCode")).click();
  }

  /// Page 3
  @Override
  public void FillMaskedPasswordAndClickLogin(String password){
	  Boolean Pwdfield0  = driver.findElement(By.id("passwd_0")).isEnabled();
    if(Pwdfield0 == true){
      driver.findElement(By.id("passwd_0")).sendKeys("D");
    }
    
    Boolean Pwdfield1 = driver.findElement(By.id("passwd_1")).isEnabled();
    if (Pwdfield1 == true){
      driver.findElement(By.id("passwd_1")).sendKeys("e");
    }

    Boolean Pwdfield2 = driver.findElement(By.id("passwd_2")).isEnabled();
    if (Pwdfield2 == true){
      driver.findElement(By.id("passwd_2")).sendKeys("v");
    }

    Boolean Pwdfield3 = driver.findElement(By.id("passwd_3")).isEnabled();
    if (Pwdfield3 == true){
      driver.findElement(By.id("passwd_3")).sendKeys("S");
    }

    Boolean Pwdfield4 = driver.findElement(By.id("passwd_4")).isEnabled();
    if (Pwdfield4 == true){
      driver.findElement(By.id("passwd_4")).sendKeys("k");
    }

    Boolean Pwdfield5 = driver.findElement(By.id("passwd_5")).isEnabled();
    if (Pwdfield5 == true){
      driver.findElement(By.id("passwd_5")).sendKeys("i");
    }

    Boolean Pwdfield6 = driver.findElement(By.id("passwd_6")).isEnabled();
    if (Pwdfield6 == true){
      driver.findElement(By.id("passwd_6")).sendKeys("l");
    }

    Boolean Pwdfield7 = driver.findElement(By.id("passwd_7")).isEnabled();
    if (Pwdfield7 == true){
      driver.findElement(By.id("passwd_7")).sendKeys("l");
    }

    Boolean Pwdfield8 = driver.findElement(By.id("passwd_8")).isEnabled();
    if (Pwdfield8 == true){
      driver.findElement(By.id("passwd_8")).sendKeys("1");
    }

    Boolean Pwdfield9 = driver.findElement(By.id("passwd_9")).isEnabled();
    if (Pwdfield9 == true){
      driver.findElement(By.id("passwd_9")).sendKeys("!");
    }    
  }

  @Override
  public String GetLoggedInText(){
    String text = driver.findElement(By.id("loggedIn")).getText();
    return text;
  }

}
