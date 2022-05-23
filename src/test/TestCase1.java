package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"));

        WebElement logoImage = driver.findElement(By.xpath("//*[@id=\"n-48560\"]"));

        if(logoImage.isDisplayed()) System.out.println("Comfy Elite image validation is PASSED");
        else System.out.println("Comfy Elite image validation is FAILED!!!");

        WebElement heading2 = driver.findElement(By.xpath("//*[@id=\"n-48560\"]"));

        if(heading2.isDisplayed()) System.out.println("Comfy Elite H2 validation is PASSED");
        else System.out.println("Comfy Elite H2 validation is FAILED!!!");

        Driver.quitDriver();

    }
}
