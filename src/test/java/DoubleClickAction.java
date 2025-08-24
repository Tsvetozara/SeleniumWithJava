import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class DoubleClickAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/tags/tryit.asp/filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.click();
        box1.sendKeys("WELCOME");

        //Double click action on the button

        Actions act = new Actions(driver);

        act.doubleClick(button).perform();

        //validation: box2 should contain "WELCOME"

        String text = box2.getAttribute("value");

        System.out.println("Captured value is: " + text);

        if(text.equals("WELCOME"))
        {
            System.out.println("Text copied....");
        }
        else
        {
            System.out.println("Text not copied properly....");
        }
    }
}
