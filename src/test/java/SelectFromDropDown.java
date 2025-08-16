import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectFromDropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);

        //Select option from the dropdown can be done in 3 ways:

        drpCountry.selectByContainsVisibleText("France");
        //drpCountry.selectByValue("japan");
        //drpCountry.selectByIndex(2);

        //Capture options from the dropdown

        List<WebElement> options = drpCountry.getOptions();
        System.out.println("Number of options in a dropdown is: " + options.size());

        //Printing options

        for(int i=0; i< options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        }

        //Printing options with enhanced for loop

        for(WebElement op: options)
        {
            System.out.println(op.getText());
        }

    }
}
