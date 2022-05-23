package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"));

        WebElement signUp = driver.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement signUpInput = driver.findElement(By.cssSelector("input[data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));

        signUp.click();
        System.out.println(signUpInput.isSelected() ? "Signup is selecetd on PASSED" : "signup is marked off FAILED");

        signUp.click();
        System.out.println(!signUpInput.isSelected() ? "Signup is  not selected PASSED" : "Signup is marked on FAILED");


        Driver.quitDriver();
    }
}
