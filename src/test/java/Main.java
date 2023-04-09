import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Main {
    @Test

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;

    @Test
        void practiceFormTest(){
        open("/selenide/selenide/");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(".filterable-active").shouldHave(Condition.text("SoftAssertions"));
        $("a href= /selenide/selenide/wiki/SoftAssertions").click();
        $(".markdown-body").shouldHave(Condition.text("Using JUnit5 extend test class"));

    }
}



