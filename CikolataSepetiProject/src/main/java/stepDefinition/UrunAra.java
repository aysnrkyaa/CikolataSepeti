package stepDefinition;

import PageObjectModel.Home_page_function;
import PageObjectModel.Login_page_function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UrunAra {

    Login_page_function login_page_function=new Login_page_function();
    Home_page_function home_page_function=new Home_page_function();

    @Given("^go to cikolatasepeti websiteee$")
    public void go_to_cikolatasepeti_websiteee() throws Throwable {
        login_page_function.setup("https://www.cikolatasepeti.com/");

    }

    @Given("^send product name$")
    public void send_product_name() throws Throwable {
       home_page_function.sendproductname("Çiçek");
    }

    @Given("^click search button$")
    public void click_search_button() throws Throwable {
       home_page_function.clicksearchbutton();
    }

    @When("^click cicek$")
    public void click_cicek() throws Throwable {
       home_page_function.clickcicek();
    }

    @Then("^read cicek info$")
    public void read_cicek_info() throws Throwable {
        home_page_function.readcicekinfo();
        login_page_function.quitdriver();
    }
}
