package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;


public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        //For opening browser
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        clickOnElement(By.linkText("Log in"));
        // Find & Type email to email field
        sendTextToElement(By.id("Email"),"test123@gmail.com");
        // Find & type the password field element
        sendTextToElement(By.name("Password"),"tes123");
        //click on LOGIN button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
        //Verify the ‘Log out’ text is display
        String expectMessage = "Log out";
        //Find the text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualMessage = actualTextMessageElement.getText();

        // Validate actual and expected message
        Assert.assertEquals("No such text passed", expectMessage,actualMessage);

        /*String expectedMessage = "Log out";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),Log out')]"));
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

         */

}
@Test
public void verifyTheErrorMessage(){
       clickOnElement(By.linkText("Log in"));


   // clickOnElement(By.linkText("Login"));
    // Find & Type Invalid email to email field
    sendTextToElement(By.id("Email"),"test123@gmail.com");
    // Find & type Invalid password the password field
    sendTextToElement(By.name("Password"),"tes123");
    //click on LOGIN button
    clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
    //clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
    //Verify logout text is display

    String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
    String actualMessage = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
    Assert.assertEquals("No customer account found", expectedMessage, actualMessage);
}
    @After
    public void tearDown(){
        closeBrowser();

    }
}
/*userShouldLoginSuccessfullyWithValidCredentials
        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display

 */
/* userShouldNavigateToLoginPageSuccessfully
 * click on the ‘Login’ link
 * Verify the text ‘Welcome, Please Sign In!’

 */
/*verifyTheErrorMessage
* click on the ‘Login’ link
* Enter invalid username
* Enter invalid password
* Click on Login button
* Verify the error message ‘Login was unsuccessful.
 Please correct the errors and try again. No customer account found’
  */