import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectFromAutoCompleteDropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

        WebElement searchBox = driver.findElement(By.id("autocomplete"));

        searchBox.clear();

        searchBox.sendKeys("Toronto");

        String text;

        do {
            {
                searchBox.sendKeys(Keys.ARROW_DOWN);
                text = searchBox.getAttribute("value");

                if (text.equals("Toronto, OH, USA")) {
                    searchBox.sendKeys(Keys.ENTER);
                    break;
                }
            }


        } while (!text.isEmpty());

    }
}
