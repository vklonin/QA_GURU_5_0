import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubCheckingIssueName {
    String REPOSITORY = "vklonin/QA_GURU_2_0";
    String ISSUE_NAME = "Just to check if it exists";

    @Test
    public void webInterfaceCheck(){
        open("https://github.com/");
        $(byAttribute("name", "q")).sendKeys(REPOSITORY);
        $(byAttribute("name", "q")).pressEnter();
        $(byAttribute("href", "/"+REPOSITORY)).click();
        $(by("data-hotkey", "g i")).click();
        $(withText(ISSUE_NAME)).should(Condition.exist);
    }

}
