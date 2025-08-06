import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckBoxes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) Select specific checkbox
        driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //2) Select all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }

        //Selecting all checkboxes using enhanced for loop
        //(WebElement checkbox: checkboxes)
        // {
        //     checkbox.click();
        //  }
    }
}
