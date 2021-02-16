import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.parameter;
import static io.qameta.allure.Allure.step;
public class GithubCheckingIssueNameLambda {
private static final String REPOSITORY = "vklonin/QA_GURU_2_0";
private static final String ISSUE_NAME = "Just to check if it exists";
private static final String BASE_URL = "https://github.com/";

    @Test
    @DisplayName("Поиск issue по имени")
    @Owner("kloninvv")
    @Tags({@Tag("crirical"), @Tag("web")})
    @Link(BASE_URL)

    public void webInterfaceCheck(){
        parameter("Repository", REPOSITORY);
        parameter("Issue name", ISSUE_NAME);

        step("Open a main page" , () -> open(BASE_URL));
        step("Look up for repository" , () -> {
            $(byName("q")).setValue(REPOSITORY).pressEnter();
        });
        step("Going in to a found repository", () -> $(byAttribute("href", "/"+REPOSITORY)).click());
        step("Going in to issues tab", () -> $(by("data-hotkey", "g i")).click());
        step("Check if issue with certain name exist", () -> {
            $(withText(ISSUE_NAME)).should(visible);
        });
    }
}
