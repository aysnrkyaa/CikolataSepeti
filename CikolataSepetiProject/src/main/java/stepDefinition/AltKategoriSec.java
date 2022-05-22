package stepDefinition;

import PageObjectModel.Home_page_function;
import PageObjectModel.Login_page_function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AltKategoriSec {

    Login_page_function login_page_function = new Login_page_function();
    Home_page_function home_page_function = new Home_page_function();

    @Given("^go to cikolatasepet websitee$")
    public void go_to_cikolatasepet_websitee() throws Throwable {
        login_page_function.setup("https://www.cikolatasepeti.com/");

    }

    @Given("^click ozelgun$")
    public void click_ozelgun() throws Throwable {
        home_page_function.clickozelgun();
    }

    @Given("^click sevgililergun$")
    public void click_sevgililergun() throws Throwable {
        home_page_function.clicksevgililergun();
    }

    @When("^click product$")
    public void click_product() throws Throwable {
        home_page_function.clickproduct();
    }

    @Then("^read product name$")
    public void read_product_name() throws Throwable {
        home_page_function.readproductname();
       // login_page_function.driverquit();
    }


}
