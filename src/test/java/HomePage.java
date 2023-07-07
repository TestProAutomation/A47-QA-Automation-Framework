import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends BasePage {
    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By firstPlaylist = By.ByCssSelector(".playlist:nth-child(3)");
    By playlistNameField = By.ByCssSelector("[name='name']");

    public void doubleClickPlaylist() {
        doubleClick(firstPlaylist);
    }

    public void enterNewPlaylistName(String playlistName) {
        findElement(playlistNameField).sendKeys(playlistName);
        findElement(playlistNameField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.BACK_SPACE));
        findElement(playlistNameField).sendKeys(playlistName);
        findElement(playlistNameField).sendKeys(Keys.ENTER);
    }

    public boolean doesPlaylistExist(String playlistName) {
        By newPlaylist = By.xpath("//a[text()='"+playlistName+"']");
        return findElement(newPlaylist).isDisplayed();
    }
}
