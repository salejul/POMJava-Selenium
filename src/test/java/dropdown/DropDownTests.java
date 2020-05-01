package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickTheDropdownLink();

        String option = "Option 2";
        dropDownPage.selectFromDropDown("Option 2");
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections...");
        assertTrue(selectedOptions.contains(option), "Something went wrong!");
    }

}
