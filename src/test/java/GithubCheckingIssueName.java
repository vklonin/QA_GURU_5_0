import static com.codeborne.selenide.Condition.*;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubCheckingIssueName {
    private static final String REPOSITORY = "vklonin/QA_GURU_2_0";
    private static final String ISSUE_NAME = "Just to check if it exists";
    @Test
    public void webInterfaceCheck(){
        open("https://github.com/");
        $(byName("q")).setValue(REPOSITORY).pressEnter();
        $(byAttribute("href", "/"+REPOSITORY)).click();
        //$(by("data-hotkey", "g i")).click();
        $(byText("Issues")).click();
        $(withText(ISSUE_NAME)).should(visible);
    }
}


//        3. $(by("data-hotkey", "g i")) может лучше по тексту искать?
