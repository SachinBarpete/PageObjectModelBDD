package com.bridgelabz.pages;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {
    private By loginBtn = By.xpath("//span[contains(text(),'Log in')]");
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private  By login = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/button[1]/span[1]");

    HomePage homePage;
    public LoginPage() {
        BaseClass baseClass = new BaseClass();
        baseClass.initialization();
    }

    public void launchURL(String url){
        driver.get(url);
    }

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void clickOnLoginBtn(){

        driver.findElement(loginBtn).click();
    }

    public void enterUnamePwd(String uname, String pwd){
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
    }

    public HomePage login(){
        driver.findElement(login).click();
        return new HomePage();
    }

    public HomePage initialLogin(String url, String uname, String pwd){
        driver.get(url);
        driver.findElement(loginBtn).click();
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(login).click();
        return new HomePage();

    }

    public void closeDriver(){
        driver.close();
    }

}
