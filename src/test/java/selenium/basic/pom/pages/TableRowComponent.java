package selenium.basic.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import selenium.basic.pom.pages.BasePage;

public class TableRowComponent{
    @FindBy(css = "th")
    private WebElement rank;
    @FindBy(xpath = "./td[1]")
    private WebElement peak;
    @FindBy(xpath = "./td[2]")
    private WebElement mountainRange;
    @FindBy(xpath = "./td[3]")
    private WebElement state;
    @FindBy(xpath = "./td[4]")
    private WebElement height;
    public TableRowComponent(WebElement parent) {
        PageFactory.initElements(new DefaultElementLocatorFactory(parent), this);
    }

    public int getHeight() {
        return Integer.parseInt(height.getText());
    }
    public String getPeak(){
        return peak.getText();
    }

    public String getName() {
        return state.getText();
    }

    public String getRank() {
        return rank.getText();
    }
}
