package com.AutomatedTest.UI_Test.Page;

import com.AutomatedTest.UI_Test.Utils.MyDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

//remote
public class BasePage {
    public BasePage(){//it should be otherwise @FindBy cannot work

        PageFactory.initElements(MyDriver.get(), this);
    }

    public static void clearCookiees() {
        //Delete all the cookies
        MyDriver.get().manage().deleteAllCookies();
    }

    public void scrollDown(WebElement link) throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) MyDriver.get();
        /**
         *  this script must scroll, until link element is visible
         *  once link element visible, it will stop scrolling
         *  arguments[0] = means first webelement after comma (link)
         *  arguments it's an array of webelements after comma
         *  arguments[0] = link web element, it can be any web element
         */
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)", link);
        Thread.sleep(3000);
    }

    public static void threadWait(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
