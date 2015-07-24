package foo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateCallsTest extends TestTemplate<Integer> {

    int i = 0;

    @Test(dataProvider = "testParameters")
    public void callExecuteTest(Integer testParameters)
            throws Exception {

        System.out.println(i);
        i++;
    }



    @DataProvider(name = "testParameters")
    public Object[][] getOnboardingTestParameters() {
        return new Object[][] {
                { new Integer(2) }

        };
    }
}
