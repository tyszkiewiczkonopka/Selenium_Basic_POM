package selenium.basic.pom;

import org.junit.jupiter.api.RepeatedTest;
import selenium.basic.pom.pages.FormPage;

public class FormTest extends BaseTest {
    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void should_successfully_sign_in() {
        FormPage formPage = new FormPage(driver);

        formPage.go()
                .fillform()
                .chooseFileToUpload()
                .submitForm();

    }
}
