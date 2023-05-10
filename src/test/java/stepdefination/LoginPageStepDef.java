package stepdefination;

import com.bridgelabz.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("launch url {string}")
    public void launch_url(String url) {
        loginPage.launchURL(url);
    }

    @When("click on Log in button")
    public void click_on_log_in_button() {
        loginPage.clickOnLoginBtn();
    }

    @And("Enter email {string} and password {string}")
    public void enter_email_and_password(String username, String password) {
        loginPage.enterUnamePwd(username, password);
    }

    @Then("verify login page title {string}")
    public void verify_login_page_title(String title) throws InterruptedException {
        Thread.sleep(2000);
        String homePageTitle = loginPage.getLoginPageTitle();
        Assert.assertEquals(title, homePageTitle);
    }

    @Then("login and redirect to homepage")
    public void login_and_redirect_to_homepage() {
        loginPage.login();
    }

    @Then("login page close driver")
    public void login_page_close_driver() {
        loginPage.closeDriver();
    }

}
