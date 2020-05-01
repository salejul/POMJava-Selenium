package cookies;

import base.BaseTest;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CookiesTests extends BaseTest {

    @Test
    public void testDeleteCookie(){
        var cookieManager = getCookieManager();

        Cookie cookie = cookieManager.buildCookie("optimizelyBuckets", "%7B%TD");
        cookieManager.deleteCookie(cookie);
        Assert.assertFalse(cookieManager.isCookiePresent(cookie), "Cookie was not deleted!");
    }
}
