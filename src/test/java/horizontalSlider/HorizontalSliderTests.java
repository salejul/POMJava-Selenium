package horizontalSlider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HorizontalSliderTests extends BaseTest {

    @Test
    public void SliderTests(){

        var sliderPage = homePage.clickTheHorizontalSliderLink();
        String value = "5";
        sliderPage.setSliderValue(value);
        Assert.assertEquals(sliderPage.getSliderValue(), value, "Something bad happened!");

    }
}
