import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubCheckingIssueName {

    @Test
    public void webInterfaceCheck(){
        open("https://github.com/vklonin");
        $(by("title", "QA_GURU_2_0")).click();
        $(by("data-hotkey", "g i")).click();
        $("#issue_1_link").shouldHave(Condition.text("Just to check if it exists"));
        sleep(3000);
    }

}
