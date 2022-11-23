package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    //for opening browser
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.linkText("Computers"));
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]"));
        // Validate actual and expected message
        Assert.assertEquals("Computers", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        clickOnElement(By.linkText("Electronics"));
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]"));
        // Validate actual and expected message
        Assert.assertEquals("Electronics", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        clickOnElement(By.linkText("Apparel"));
        String expectedMessage = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[3]"));
        Assert.assertEquals("Apparel", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        clickOnElement(By.linkText("Digital downloads"));
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]"));
        Assert.assertEquals("Digital downloads", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        clickOnElement(By.linkText("Jewelry"));
        String expectedMessage = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]"));
        Assert.assertEquals("Jewelry",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        clickOnElement(By.linkText("Gift Cards"));
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]"));
        Assert.assertEquals("Gift Cards",expectedMessage,actualMessage);
    }




    @After
    public void tearDown() {
        closeBrowser();
    }
}



/* userShouldNavigateToComputerPageSuccessfully
* click on the ‘Computers’ Tab
* Verify the text ‘Computers’
2. userShouldNavigateToElectronicsPageSuccessfully
* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’
 */
