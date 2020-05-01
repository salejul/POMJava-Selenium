package javascript;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JavascriptTests extends BaseTest {

    @Test
    public void scrollToTableTest(){
        homePage.clickTheLArgeAndDeepDOMLink().scrollToTable();
    }

    @Test
    public void infiniteScrollTest(){
        homePage.clickTheInfiniteScrollLink().scrollToParagraph(9);
    }

    @Test
    public void testAddMultipleAttributeToDropdown() {

        var dropDownPage = homePage.clickTheDropdownLink();
        dropDownPage.addMultipleAttribute();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        var selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        Assert.assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
