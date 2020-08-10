package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {
    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser: ");
    }

    @After
    public void TearDownTest(Scenario scenario){
        if(scenario.isFailed()){
            //Take screenshot logic?
            System.out.println(scenario.getName());
        }
        System.out.println("Cleaning the browser: ");
    }
}
