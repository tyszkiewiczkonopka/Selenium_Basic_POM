package selenium.basic.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class FormPage extends BasePage {
    private final Random random = new Random();
    @FindBy(id = "inputFirstName3")
    private WebElement firstNameInput;
    @FindBy(id = "inputLastName3")
    private WebElement lastNameInput;
    @FindBy(id = "inputEmail3")
    private WebElement emailInput;
    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> experienceButtons;
    @FindBy(name = "gridRadiosSex")
    private List<WebElement> sexButtons;
    @FindBy(id = "inputAge3")
    private WebElement ageInput;
    @FindBy(id = "gridCheckAutomationTester")
    private WebElement automationTesterButton;
    @FindBy(id = "selectContinents")
    private WebElement selectContinentsElement;
    @FindBy(id = "selectSeleniumCommands")
    private WebElement seleniumCommandsElement;
    @FindBy(id = "chooseFile")
    private WebElement chooseFileButton;
    @FindBy(css = ".btn.btn-primary")
    private WebElement signInButton;

    public FormPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FormPage go() {
        driver.get(BASE_URL + "/form.php");
        return this;
    }

    public FormPage fillform() {
        firstNameInput.sendKeys("Magdalena");
        lastNameInput.sendKeys("Tyszkiewicz");
        emailInput.sendKeys("mtyszkiewicz@sii.pl");
        sexButtons.get(random.nextInt(sexButtons.size())).click();
        ageInput.sendKeys("18");
        experienceButtons.get(random.nextInt(experienceButtons.size())).click();
        automationTesterButton.click();

        Select selectContinent = new Select(selectContinentsElement);
        List<WebElement> continents = selectContinent.getOptions();
        selectContinent.selectByIndex(random.nextInt(continents.size() - 1) + 1);

        Select selectCommand = new Select(seleniumCommandsElement);
        selectCommand.selectByValue("switch-commands");
        selectCommand.selectByValue("wait-commands");
        return this;
    }

    public FormPage chooseFileToUpload() {
        chooseFileButton.sendKeys("C:\\Users\\mtyszkiewicz\\IdeaProjects\\Selenium_Basic_POM\\target\\filesToUpload\\search-bug.jpg");
        return this;
    }

    public FormPage submitForm() {
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        return this;
    }
}
