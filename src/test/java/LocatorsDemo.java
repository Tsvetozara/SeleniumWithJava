import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //By name
        driver.findElement(By.name("search")).sendKeys("Mac");

        //By id
        boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplayStatus);

        //By linkedText and partialLinkText
        driver.findElement(By.linkText("Tablets")).click();
        //driver.findElement(By.partialLinkText("Table")).click(); //only partial text "Table"

        //By classname
        List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
        System.out.println("Total number of header links: " + headerLinks.size());

        //By tagname
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links: " + links.size());
    }
}