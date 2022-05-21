package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Head Hunter Tests")
    void generatedTest() {
        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("void openMainPage() {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(\"https://spb.hh.ru);", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".supernova-icon-services-dynamic\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".supernova-overlay__content\").shouldHave(text(\"Сервисы для соискателей\"));", () -> {
            step("// todo: just add selenium action");
        });

        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("void choseTown() {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(\"https://spb.hh.ru);", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".supernova-navi-item_area-switcher-button\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(byLinkText(\"Санкт-Петербург\")).click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".supernova-navi\").shouldHave(text(\"Санкт-Петербург\"));", () -> {
            step("// todo: just add selenium action");
        });

        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("void searchVacancies() {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(\"https://spb.hh.ru);", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".bloko-input_scale-large\").setValue(\"Тестировщик\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".bloko-button_stretched\").submit();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".vacancy-serp-content\").shouldHave(text(\"Тестировщик\"));", () -> {
            step("// todo: just add selenium action");
        });

        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("void chooseAVacancyInMyTown() {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(\"https://spb.hh.ru/?customDomain=1\");", () -> {
            step("// todo: just add selenium action");
        });

        step("$$(\"ul.multiple-column-list_narrow li\").get(11).$(\"a\").click();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".bloko-input\").setValue(\"Тестировщик\").pressEnter();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".vacancy-serp-content\").shouldHave(text(\"Тестировщик\"));", () -> {
            step("// todo: just add selenium action");
        });

        step("@Test", () -> {
            step("// todo: just add selenium action");
        });

        step("void selectNews() {", () -> {
            step("// todo: just add selenium action");
        });

        step("open(\"https://spb.hh.ru);", () -> {
            step("// todo: just add selenium action");
        });

        step("$(byLinkText(\"Что такое «сильные стороны» и как их определить\")).pressEnter();", () -> {
            step("// todo: just add selenium action");
        });

        step("$(\".cms-header-content \").shouldHave(text(\"Что такое «сильные стороны» и как их определить\"));", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://spb.hh.ru'", () ->
            open("https://spb.hh.ru"));

        step("Page title should have text 'Работа в Санкт-Петербурге, поиск персонала и публикация вакансий - spb.hh.ru'", () -> {
            String expectedTitle = "Работа в Санкт-Петербурге, поиск персонала и публикация вакансий - spb.hh.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://spb.hh.ru'", () ->
            open("https://spb.hh.ru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}