package Steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigate to the login page!");

    }

   /* @And("I enter the the following for Login")
    public void iEnterTheTheFollowingForLogin(DataTable table) {
        //https://www.youtube.com/watch?v=Fd10Wx0BUmE&list=PL6tu16kXT9PpteusHGISu_lHcV6MbBtA6&index=6
*//*    List<List<String>> data =  table.asLists();
        System.out.println( data.get(0).get(0));
        System.out.println( data.get(0).get(1));*//*

        //Create an ArrayList
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class); //Store all the users

        for(User user:users){
            System.out.println("Username: " + user.UserName);
            System.out.println("Password: " + user.Password);
        }

    }*/


    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUserNameAndPassword(String userName, String password) throws Throwable {
       // System.out.println("User: " +  userName + " Password: " + password);
    }


    @And("I click login button")
    public void iClickLoginButton() {
        //System.out.printf("Login button clicked!!");
    }

    @Then("I should see the user form page")
    public void iShouldSeeTheUserFormPage() {

        //System.out.println("User form is displayed!!");
    }


    public class User{
        public String UserName;
        public String Password;

        public User(String userName, String password) {
            UserName = userName;
            Password = password;
        }
    }

}
