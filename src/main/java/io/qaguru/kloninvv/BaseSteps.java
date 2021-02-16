package io.qaguru.kloninvv;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class BaseSteps {
    @Step("Open main page")
    public void openMainPage(final String baseURL) {
        open(baseURL);
    }
    @Step("Look up for repository")
    public void lookForRepository(final String repository){
        $(byName("q")).setValue(repository).pressEnter();
    }
    @Step("Going in to the found repository")
    public void goingInToFoundRepository(final String repository){
        $(byAttribute("href", "/"+ repository)).click();
    }
    @Step("Going to the issue tab")
    public void goingToTheIssueTab(){
        $(by("data-hotkey", "g i")).click();
    }
    @Step("Checking issue name")
    public void chekingIssueName(final String issueName){
        $(withText(issueName)).should(Condition.exist);
    }
}
