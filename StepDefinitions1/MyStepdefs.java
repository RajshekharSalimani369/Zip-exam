package StepDefinitions1;

import PageObject.AdminloginPage;
import PageObject.ExamPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyStepdefs {
    AdminloginPage adminloginpage;
    ExamPage exampage;
    WebDriver driver;
    @Given("User launch browser")
    public void user_launch_browser() {
        WebDriverManager.chromedriver();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @When("User enters admin url {string}")
    public void user_enters_admin_url(String urladmin) {
        driver.get(urladmin);
    }

    @And("User enters valid contact number and password")
    public void userEntersContactNumberAndPassword() {
        adminloginpage=new AdminloginPage(driver);
        adminloginpage.enterContactNumber("1143");
        adminloginpage.enterPassword("iris@1143");
    }

    @And("User clicks on login")
    public void userClicksOnLogin() {
        adminloginpage.clickLogin();
    }

    @Then("the expected title of the page should be  {string}")
    public void theExpectedTitleOfThePageShouldBe(String expectedtitle) {
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedtitle);
    }



    @And("User clicks on Add Exam option")
    public void userClicksOnAddExamOption() {
        exampage=new ExamPage(driver);
        exampage.clickexamButton();
    }

    @When("User enters data in the exam name textbox")
    public void userEntersDataInTheExamNameTextbox() {
        exampage=new ExamPage(driver);
        exampage.enterExamNameTextBox("exam text");
    }

    @And("User enters data in duration textbox")
    public void userEntersDataInDurationTextbox() {
        exampage=new ExamPage(driver);
        exampage.enterdurationTextBox("100");
    }


    @And("User enters in target audience")
    public void userEntersInTargetAudience() {
        exampage=new ExamPage(driver);
        exampage.enterTargetAudience("100");
    }

    @And("User enters in Instruction textbox")
    public void userEntersInInstructionTextbox() {
        exampage=new ExamPage(driver);
        exampage.enterInstructions("instruction text");
    }

    @And("User clicks on Submit")
    public void userClicksOnSubmit() {
        exampage=new ExamPage(driver);
        exampage.clickSubmit();
    }

    @And("User enters invalid contact number and password")
    public void userEntersInvalidContactNumberAndPassword() {
        adminloginpage=new AdminloginPage(driver);
        adminloginpage.enterContactNumber("1142");
        adminloginpage.enterPassword("iris@1143");
    }

    @Then("User will view Incorrect credentials message pop-up")
    public void userWillViewIncorrectCredentialsMessagePopUp() {
       int displayedelement= adminloginpage.inCorrectCredView();
        System.out.println(displayedelement);
       Assert.assertEquals(displayedelement,1);

    }

    @And("User enters valid contact number and invalid password")
    public void userEntersValidContactNumberAndInvalidPassword() {
        adminloginpage=new AdminloginPage(driver);
        adminloginpage.enterContactNumber("1143");
        adminloginpage.enterPassword("Iris@1143");
    }

    @And("User enters invalid  contact number and invalid password")
    public void userEntersInvalidValidContactNumberAndInvalidPassword() {
        adminloginpage=new AdminloginPage(driver);
        adminloginpage.enterContactNumber("1141");
        adminloginpage.enterPassword("Iris@1141");
    }

    @And("User selects add exam from the list")
    public void userSelectsAddExamFromTheList() {
        exampage=new ExamPage(driver);
        exampage.clickExamList();
    }


}
