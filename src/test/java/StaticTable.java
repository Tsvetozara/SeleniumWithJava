import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class StaticTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //1) Find total number of rows in a table // Approach 1 //preferred for multiple tables
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows: " + rows);

        //2) Find total number of rows in a table //Approach 2 with tag //single table
        // int rows = driver.findElements(By.tagName("tr")).size();

        //3) Find total number of columns in a table //Approach 1 // Preferred for multiple tables
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of columns: " + columns);

        //4) Find total number of columns in a table //Approach 2 with tag //single table
        // int columns = driver.findElements(By.tagName("th")).size();

        //5) Read data from a specific row and column
        String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookName);

        //6) Read data from all rows and columns
        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[" + c + "]")).getText();
                System.out.println(value + "\t");
            }
            System.out.println();
        }

        //7) Print book names whose author is Mukesh
        for(int r=2; r<=rows; r++)
        {
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(authorName.equals("Mukesh"))
            {
                String bookName1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(bookName1 + "\t" + authorName);
            }
        }

        //8) Find total prices of all books
        int total = 0;
        for(int r=2; r<=rows; r++)
        {
            String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total = total + Integer.parseInt(price);
        }
        System.out.println("Total proce of the books: " + total);
    }
}
