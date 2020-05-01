package keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTest extends BaseTest {

    @Test
    public void testBackspace(){
        var keysPressPage = homePage.clickTheKeyPressLink();
        keysPressPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keysPressPage.getResult(), "You entered: BACK_SPACE");
    }
}
