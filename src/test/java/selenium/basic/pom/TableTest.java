package selenium.basic.pom;

import org.junit.jupiter.api.RepeatedTest;
import selenium.basic.pom.pages.TablePage;

public class TableTest extends BaseTest {
    @RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
    void should_print_swiss_mountain_higher_than_4000() {
        TablePage tablePage = new TablePage(driver);

        tablePage
                .go()
                .printMountainHigherThan(4000);
    }
}
