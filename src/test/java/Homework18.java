import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public void playASongTest() {
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());

        public boolean isSongPlaying() {
            WebElement soundBar = driver.findElement(By.xpath("//div[@data-testid='sound-bar-play']"));
            return soundBar.isDisplayed();
        }

    }
}
