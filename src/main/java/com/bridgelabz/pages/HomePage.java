package com.bridgelabz.pages;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;

public class HomePage extends BaseClass {

    private By search = By.xpath("//span[contains(text(),'Search')]");
    private By searchField = By.xpath("//input[@placeholder='What do you want to listen to?']");


    public void clickOnSearch() {
        driver.findElement(search).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeOnSearchField(String track) {
        driver.findElement(searchField).sendKeys(track);
    }

    public String verifyTitle() {
        return driver.getTitle();
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void closeDriver(){
        driver.close();
    }
}
