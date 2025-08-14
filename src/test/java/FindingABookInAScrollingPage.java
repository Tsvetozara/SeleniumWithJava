import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindingABookInAScrollingPage {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.booksbykilo.in/new-books");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean found = false;

        while(!found)
        {
            List<WebElement> books = driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
            for(WebElement book: books)
            {
                if(book.getText().equals("Santa Baby"))
                {
                    System.out.println("Book Found!");
                    found= true;
                    break;
                }
            }

            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        }
            driver.quit();


    }
}
