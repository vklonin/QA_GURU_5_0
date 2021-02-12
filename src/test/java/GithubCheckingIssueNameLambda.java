import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GithubCheckingIssueNameLambda {
    String REPOSITORY = "vklonin/QA_GURU_2_0";
    String ISSUE_NAME = "Just to check if it exists";

    @Test
    public void webInterfaceCheck(){

        step("Open a main page" , () -> open("https://github.com/"));
        step("Look up for repository" , () -> {
            $(byAttribute("name", "q")).sendKeys(REPOSITORY);
            $(byAttribute("name", "q")).pressEnter();
        });
        step("Going in to a found repository", () -> $(byAttribute("href", "/"+REPOSITORY)).click());
        step("Going in to issues tab", () -> $(by("data-hotkey", "g i")).click());
        step("Check if issue with certain name exist", () -> {
            $(withText(ISSUE_NAME)).should(Condition.exist);
        });

    }

}
