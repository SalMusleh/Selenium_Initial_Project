package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//a[@href='/contact-us']"));
        contactUs.click();

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us"));

        WebElement sendButton = driver.findElement(By.xpath("//button[@data-ux='ButtonPrimary']"));
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() ? "Send button validation PASSED" : "Send button validation FAILED");
        WebElement sendButtonText = driver.findElement(By.xpath("//button[text()='Send']"));
        System.out.println(sendButtonText.getText().equals("SEND") ? "Send button text validation PASSED" : "Send button text validation FAILED");

        Driver.quitDriver();
    }
}
