package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"));

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));

        if(heading1.isDisplayed()) System.out.println("heading1 displayed validation is PASSED");
        else System.out.println("heading1 displayed validation is FAILED!!!");

        WebElement facebookIcon = driver.findElement(By.xpath("//span[text()='Connect With Us']"));

        if(facebookIcon.isDisplayed()) System.out.println("facebookIcon displayed validation is PASSED");
        else System.out.println("facebookIcon displayed validation is FAILED!!!");

        WebElement instagramIcon = driver.findElement(By.xpath("//span[text()='Connect With Us']"));

        if(instagramIcon.isDisplayed()) System.out.println("instagramIcon displayed validation is PASSED");
        else System.out.println("instagramIcon displayed validation is FAILED!!!");

        Driver.quitDriver();
    }
}
