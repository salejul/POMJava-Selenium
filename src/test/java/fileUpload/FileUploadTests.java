package fileUpload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTest {

    @Test
    public void fileUploadTests(){

        var fileUpload = homePage.clickTheFileUploadLink();
        fileUpload.uploadFile("C:\\WebDrivers\\geckodriver.exe");
        Assert.assertTrue(fileUpload.getUploadedFiles().equals("geckodriver.exe"), "Files do not match!");
    }
}
