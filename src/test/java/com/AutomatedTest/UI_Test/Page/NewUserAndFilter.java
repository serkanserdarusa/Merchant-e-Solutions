package com.AutomatedTest.UI_Test.Page;

import com.AutomatedTest.UI_Test.Utils.MyDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class NewUserAndFilter extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Users')]")
    public WebElement clickUsers;

    @FindBy(xpath = "//a[contains(text(),'New User')]")
    public WebElement clickNewUser;

    @FindBy(xpath = "//input[@id='user_username']")
    public WebElement enterUsername;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement enterPasword;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement enterEmail;

    @FindBy(xpath = "//input[@name='commit']")
    public WebElement clickCreateUser;

    @FindBy(xpath = "//div[@id='q_username_input']//select")
    public WebElement selectUsername;

    @FindBy(xpath = "//input[@id='q_username']")
    public WebElement enterTextForUsername;

    @FindBy(xpath = "//input[@name='commit']")
    public WebElement clickFilterButton;

    @FindBy(xpath = "//div[@id='q_email_input']//select")
    public WebElement selectEmail;

    @FindBy(xpath = "//input[@id='q_email']")
    public WebElement enterTextForEmail;


    public void verifyclickUsersButton() {
        threadWait();//Thread.Sleep
        clickUsers.click();
        threadWait();//Thread.Sleep
    }

    public void verifyclickNewUser() {
        threadWait();//Thread.Sleep
        clickNewUser.click();
        threadWait();//Thread.Sleep
    }

    public void VerifyEnterUsernamePasswordAndEmail(String string, String string2) {

        if (string.equalsIgnoreCase("Username")) {
            threadWait();//Thread.Sleep
            enterUsername.sendKeys(string2);
        } else if (string.equalsIgnoreCase("Password")) {
            threadWait();//Thread.Sleep
            enterPasword.sendKeys(string2);

        } else if (string.equalsIgnoreCase("Email")) {
            threadWait();//Thread.Sleep
            enterEmail.sendKeys(string2);
            threadWait();//Thread.Sleep
        }

    }

    public void verifyCreateUserButton() {

        clickCreateUser.click();
    }

    //Scenario starts from here
    public void verifyFiltersWithUsername(String dropdown, String text, String string) {
        Select select = null;
        if (string.equalsIgnoreCase("Username")) {

            selectUsername.click();

            try {
                select = new Select(selectUsername);
                select.selectByVisibleText(dropdown);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("there is mistake in here");
            }
            System.out.println(select.getOptions());


            switch (dropdown) {
                case "Contains":

                    enterTextForUsername.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                case "Equals":
                    enterTextForUsername.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                case "Starts with":

                    enterTextForUsername.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                case "Ends with":

                    enterTextForUsername.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                default:
                    System.out.println("invalid info");
            }


        }else{
            selectEmail.click();

            try {
                select = new Select(selectEmail);
                select.selectByVisibleText(dropdown);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("there is mistake in here");
            }



            switch (dropdown) {
                case "Contains":

                    enterTextForEmail.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                case "Equals":
                    enterTextForEmail.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                case "Starts with":

                    enterTextForEmail.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                case "Ends with":

                    enterTextForEmail.sendKeys(text);
                    threadWait();
                    clickFilterButton.click();
                    threadWait();
                    threadWait();
                    break;
                default:
                    System.out.println("invalid info");
            }

        }

    }
}
