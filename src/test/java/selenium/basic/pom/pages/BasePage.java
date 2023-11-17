package selenium.basic.pom.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    protected final String BASE_URL = "http://www.seleniumui.moderntester.pl/";

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
