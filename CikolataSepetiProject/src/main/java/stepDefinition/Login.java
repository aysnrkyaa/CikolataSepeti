package stepDefinition;

import PageObjectModel.Login_page_function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

    Login_page_function login_page_function = new Login_page_function();

    @Given("^go to cikolatasepeti website$")
    public void go_to_cikolatasepeti_website() throws Throwable {
        login_page_function.setup("https://www.cikolatasepeti.com/");
    }

    @Given("^click signin buttonn$")
    public void click_signin_buttonn() throws Throwable {
        login_page_function.clickSignin();
    }

    @Given("^writee username$")
    public void writee_username() throws Throwable {
        login_page_function.sendUsername("babatasezgi@hotmail.com");
    }

    @Given("^write  passwordd$")
    public void write_passwordd() throws Throwable {
        login_page_function.sendPassword("123456789.");
    }

    @When("^clickk login buttonn$")
    public void clickk_login_buttonn() throws Throwable {
        login_page_function.clickLoginbutton();
    }

    @Then("^read usernamee$")
    public void read_usernamee() throws Throwable {
        login_page_function.checkusername();
        login_page_function.cikispage();
      //  login_page_function.driverquit();
    }

}
