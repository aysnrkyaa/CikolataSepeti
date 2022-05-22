package stepDefinition;

import PageObjectModel.Login_page_function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginOlumsuz {

    Login_page_function login_page_function=new Login_page_function();


    @Given("^go to cikolatasepet website$")
    public void go_to_cikolatasepet_website() throws Throwable {
        login_page_function.setup("https://www.cikolatasepeti.com/");

    }

    @Given("^click signin button$")
    public void click_signin_button() throws Throwable {
        login_page_function.clickSignin();

    }

    @Given("^write usernamee$")
    public void write_usernamee() throws Throwable {
        login_page_function.sendUsername("babatasezgi@hotmail.com");

    }

    @Given("^write wrong password$")
    public void write_wrong_password() throws Throwable {
        login_page_function.sendPassword("1234567");

    }

    @When("^clickk loginn button$")
    public void clickk_loginn_button() throws Throwable {
        login_page_function.clickLoginbutton();

    }

    @Then("^show error message$")
    public void show_error_message() throws Throwable {
        login_page_function.showerrormessagelogin();

    }

}
