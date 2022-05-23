package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"));

        WebElement firstName = driver.findElement(By.xpath("//div[@data-aid='First Name']/input"));
        WebElement lastName = driver.findElement(By.xpath("//div[@data-aid='Last Name']/input"));
        WebElement email = driver.findElement(By.xpath("//div[@data-aid='CONTACT_FORM_EMAIL']/input"));
        WebElement message = driver.findElement(By.xpath("//div[@data-ux='Block']/textarea"));

        firstName.sendKeys("Salah");
        System.out.println(firstName.getAttribute("value").equals("Salah") ? "First name validation PASSED" : "First name validation FAILED");

        lastName.sendKeys("Musleh");
        System.out.println(lastName.getAttribute("value").equals("Musleh") ? "Last name validation PASSED" : "Last name validation FAILED");

        email.sendKeys("Salahmusleh@outlook.com");
        System.out.println(email.getAttribute("value").equals("Salahmuslehn@outlook.com") ? "Email validation PASSED" : "Email validation FAILED");

        message.sendKeys("Hello World");
        System.out.println(message.getAttribute("value").equals("Hello World") ? "Message validation PASSED" : "Message validation FAILED");

        Driver.quitDriver();

    }
}
