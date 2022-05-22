package stepDefinition;

import PageObjectModel.Home_page_function;
import PageObjectModel.Login_page_function;
import cucumber.api.java.en.Given;

public class Hakkimizda {

    Login_page_function login_page_function = new Login_page_function();
    Home_page_function home_page_function=new Home_page_function();

    @Given("^go to cikolatasepet websiteee$")
    public void go_to_cikolatasepet_websiteee() throws Throwable {
        login_page_function.setup("https://www.cikolatasepeti.com/");

    }

    @Given("^click hakkimizda$")
    public void click_hakkimizda() throws Throwable {
       home_page_function.clickhakkimizda();
    }

    @Given("^give info$")
    public void give_info() throws Throwable {
        home_page_function.infohakimizda();
    }


}
