import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingMandatoryFields {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/en-gb?route=account/register");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.xpath("//form[@id='form-register']//label"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (WebElement element : elements) {
            // System.out.println(element.getText()); //prints elements that are having '*' mark as a mandatory fields

            String script = "return window.getComputedStyle(arguments[0],'::Before').getPropertyValue('content')";
            String content = js.executeScript(script, element).toString();

            System.out.println(content); //prints '*' or none regarding which element is mandatory or not depending on having '*' symbol

            if (content.contains("*")) {
                System.out.println(element.getText() + "Mandatory field");
            } else {
                System.out.println(element.getText() + "Not mandatory field");
            }
        }

        driver.quit();
    }
}
