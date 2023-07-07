import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By emailField = By.ByCssSelector("input[type='email']");
    By passworfField = By.ByCssSelector("input[type='password'");
    By submitBtn = By.ByCssSelector("button[type='submit']");

    public void provideEmail(String email) {
        findElement(emailField).sendKeys(email);
    }

    public void providePassword(String password) {
        findElement(passworfField).sendKeys(password);
    }

    public void clickSubmit() {
        findElement(submitBtn).click();
    }

    public void login() {
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
    }
}
