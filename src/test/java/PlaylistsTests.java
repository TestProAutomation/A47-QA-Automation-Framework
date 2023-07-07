import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaylistsTests extends BasePage {

    public PlaylistsTests(WebDriver givenDriver) {
        super(givenDriver);
    }

    @Test
    public void renamePlaylist() {
        String playlistName = "Test Pro Playlist";

        LoginPage loginPage = new LoginPage(driver);
        HomePage  homePage = new HomePage(driver);

        loginPage.login();
        homePage.doubleClickFirstPlaylist();
        homePage.enterPlaylistName(playlistName);
        Assert.assertTrue(homePage.doesPlaylistExist(playlistName));
    }
}
