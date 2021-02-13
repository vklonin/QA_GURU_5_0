import io.qaguru.kloninvv.BaseSteps;
import org.junit.jupiter.api.Test;

public class GithubCheckingIssueNameSteps {
    public BaseSteps steps = new BaseSteps();
    private static final String REPOSITORY = "vklonin/QA_GURU_2_0";
    private static final String ISSUE_NAME = "Just to check if it exists";
    private static final String BASE_URL = "https://github.com/";
    @Test
    public void webInterfaceCheck(){
        steps.openMainPage(BASE_URL);
        steps.lookForRepository(REPOSITORY);
        steps.goingInToFoundRepository(REPOSITORY);
        steps.goingToTheIssueTab();
        steps.chekingIssueName(ISSUE_NAME);
    }
}
