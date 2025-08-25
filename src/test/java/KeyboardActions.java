import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.time.Duration;

public class KeyboardActions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");

        Actions act = new Actions(driver);

        //Ctrl + A - Selects the text

        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Ctrl + C - Copy the text into clipboard

        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //TAB - Shifts to second box

        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //Ctrl + V - Paste the text

        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        //Ctrl + Shift + A
        //act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();

        //Enter
        //act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
    }
}
