import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class AccountCreation {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void accountCreation2() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().setSize(new Dimension(1382, 744));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email_create")).click();
        driver.findElement(By.id("email_create")).sendKeys("onchari005@gmail.com");
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
        driver.findElement(By.xpath("//div[@id='uniform-id_gender1']/span/input")).click();
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Ambrose");
        driver.findElement(By.id("customer_lastname")).click();
        driver.findElement(By.id("customer_lastname")).sendKeys("Geondo");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("1234567890");
        driver.findElement(By.id("days")).click();
        {
            WebElement dropdown = driver.findElement(By.id("days"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:12\\s+']")).click();
        }
        driver.findElement(By.cssSelector("#days > option:nth-child(13)")).click();
        driver.findElement(By.id("months")).click();
        {
            WebElement dropdown = driver.findElement(By.id("months"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:November\\s']")).click();
        }
        driver.findElement(By.cssSelector("#months > option:nth-child(12)")).click();
        driver.findElement(By.id("years")).click();
        {
            WebElement dropdown = driver.findElement(By.id("years"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:2003\\s+']")).click();
        }
        driver.findElement(By.cssSelector("#years > option:nth-child(18)")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("Aswea");
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("56 Keroa");
        driver.findElement(By.id("address2")).click();
        driver.findElement(By.id("address2")).sendKeys("344 Naymis");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Homabay");
        driver.findElement(By.id("id_state")).click();
        {
            WebElement dropdown = driver.findElement(By.id("id_state"));
            dropdown.findElement(By.xpath("//option[. = 'Idaho']")).click();
        }
        driver.findElement(By.cssSelector("#id_state > option:nth-child(14)")).click();
        driver.findElement(By.id("postcode")).click();
        driver.findElement(By.id("postcode")).sendKeys("78887");
        driver.findElement(By.id("id_country")).click();
        driver.findElement(By.cssSelector("#id_country > option:nth-child(2)")).click();
        driver.findElement(By.id("other")).click();
        driver.findElement(By.id("other")).sendKeys("I wil cone home");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("0755665654");
        driver.findElement(By.id("phone_mobile")).click();
        driver.findElement(By.id("phone_mobile")).sendKeys("0775757677");
        driver.findElement(By.id("alias")).click();
        driver.findElement(By.id("alias")).sendKeys("679 Kero");
        driver.findElement(By.cssSelector("#submitAccount > span")).click();
        driver.findElement(By.id("center_column")).click();
        // assertThat(driver.findElement(By.cssSelector(".info-account")).getText(), is("Welcome to your account. Here you can manage all of your personal information and orders."));
        driver.findElement(By.linkText("Sign out")).click();
        driver.findElement(By.cssSelector(".logo")).click();
        driver.close();
    }
}




