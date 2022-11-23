package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        clickOnElement(By.linkText("Register"));
        String expectedMessage = "Registed";
        String actualMessage = getTextFromElement(By.xpath("//div[@class='header-links']"));
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Register"));
        // Select gender radio button
        //clickOnElement(By.xpath("//label[@for='gender']"));
        sendTextToElement(By.name("FirstName"), "Aadit");
        sendTextToElement(By.name("LastName"), "Trivedi");
        clickOnElement(By.name("DateOfBirthDay"));
        sendTextToElement(By.name("DateOfBirthDay"), "5");
        clickOnElement(By.name("DateOfBirthMonth"));
        sendTextToElement(By.name("DateOfBirthMonth"), "August");
        clickOnElement(By.name("DateOfBirthYear"));
        sendTextToElement(By.name("DateOfBirthYear"), "1925");
        //Enter Email address
        sendTextToElement(By.id("Email"), "333test@gmail.com");
        // Enter Password
        sendTextToElement(By.name("Password"), "333test");
        // Enter Confirm password
        sendTextToElement(By.name("ConfirmPassword"), "333test");
        //Click on REGISTER button
        clickOnElement(By.id("register-button"));

        //Verify the text 'Your registration completed
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        //String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        // String actualMessage = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        // String actualMessage =getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        //String actualMessage = getTextFromElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals("Your registration not completed", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}


//<div class="result">Your registration completed</div>



