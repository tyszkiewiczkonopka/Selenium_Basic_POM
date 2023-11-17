package selenium.basic.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TablePage extends BasePage {
    @FindBy(css = "tbody tr")
    private List<WebElement> rows;

    public TablePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public TablePage go() {
        driver.get(BASE_URL + "/table.php");
        return this;
    }

    public List<TableRowComponent> getRows() {
        List<TableRowComponent> rowComponents = new ArrayList<>();
        for (WebElement row : rows) {
            rowComponents.add(new TableRowComponent(row));
        }
        return rowComponents;
    }

    public void printMountainHigherThan(int expectedHeight) {
        for (TableRowComponent row : getRows()) {
            if (row.getHeight() > expectedHeight && row.getName().equals("Switzerland")) {
                System.out.println("Rank: " + row.getRank() + ", Peak: " + row.getPeak() + ", Mountain range: " + row.getName());
            }
        }
    }
}
