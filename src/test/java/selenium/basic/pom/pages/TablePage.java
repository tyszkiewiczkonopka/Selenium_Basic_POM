package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class TablePage extends BasePage {



    protected TablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


}
