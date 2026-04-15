package upload;

import base.BaseTests;
import home.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadFileTests extends BaseTests {
    @Test
    public void testUploadFileTests() {
        HomePage homePage = new HomePage(driver);
        UploadFilePage uploadFilePage= homePage.clickUploadFileLink();
        Path filePath = Paths.get("src/test/ressources/image.png");
        String path =filePath.toAbsolutePath().toString() ;
        uploadFilePage.UploadFile(path);

        uploadFilePage.clickSubmitButton();

        Assert.assertEquals(uploadFilePage.getMessage(),"File Uploaded!");

    }
}
