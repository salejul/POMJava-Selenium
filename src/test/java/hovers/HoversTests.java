package hovers;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTests extends BaseTest {

    @Test
    public void hoversTests(){
        var hoversPage = homePage.clickTheHoversLink();
        var caption = hoversPage.hoverOverFigure(3);

        Assert.assertTrue(caption.isCaptionDisplayed(), "Not displayed");
        Assert.assertEquals(caption.getTitle(), "name: user3", "Titles are not equal.");
        Assert.assertEquals(caption.getLinkText(), "View profile", "Texts are not equal");
        Assert.assertTrue(caption.getLink().endsWith("/users/3"), "Link is incorrect.");
        System.out.println("Test complete.");

    }

}
