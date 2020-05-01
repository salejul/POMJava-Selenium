package contextMenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTest {

    @Test
    public void contextMenuTests(){

        var contextMenuPage = homePage.clickTheContextMenuLink();
        contextMenuPage.clickTherightClickField();
        String message = contextMenuPage.alerts_getText();
        contextMenuPage.alerts_acceptAlert();
        Assert.assertTrue(message.contains("context"), "Incorrect message!");
    }
}
