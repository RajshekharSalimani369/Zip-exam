package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ExamPage {
    WebDriver driver;
    public ExamPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="(//div[@class='btn-group'])[2]")
    WebElement examButton;
    @FindBy(xpath="//a[@class='dropdown-item']")
    List<WebElement> examList;
    @FindBy(xpath="//input[@class='examname-input ng-untouched ng-pristine ng-invalid']") WebElement examNameTextBox;
    @FindBy(xpath="//input[@class='duration-input ng-untouched ng-pristine ng-invalid']") WebElement durationTextBox ;
    @FindBy(xpath="//input[@class='targetAudience-input ng-untouched ng-pristine ng-invalid']")WebElement targetAudience;
    @FindBy(xpath="//div[@class='angular-editor-textarea']")WebElement Instructions;
    @FindBy(xpath=" //button[text()=' Submit ']")WebElement Submit;

public void clickexamButton(){

    examButton.click();
}
public void clickExamList(){
    for (WebElement examentry :examList) {
       String strexam= examentry.getText();
       if(strexam.equalsIgnoreCase("Add Exam")){
           examentry.click();;
       }
    }
}//exam List
public void enterExamNameTextBox(String examnametext){

    examNameTextBox.sendKeys(examnametext);
}
public void enterdurationTextBox(String durationtext){

    durationTextBox.sendKeys(durationtext);
}
public void enterTargetAudience(String targetaudiencetext){

    targetAudience.sendKeys(targetaudiencetext);
}

public void enterInstructions(String Instructionstext){

    Instructions.sendKeys(Instructionstext);
}
public void clickSubmit(){

    Submit.click();
}



}
