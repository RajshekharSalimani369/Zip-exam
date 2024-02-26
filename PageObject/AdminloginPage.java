package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminloginPage {
WebDriver driver;
public AdminloginPage(WebDriver driver){
this.driver=driver;
PageFactory.initElements(driver,this);
}

@FindBy(xpath="//input[@id='typeEmailX']")WebElement contactNumber;
@FindBy(xpath="//input[@id='typePasswordX']")WebElement password;
@FindBy(xpath="//button[text()='Login']")WebElement login;

@FindBy(xpath="//div[text()=' Incorrect credentials! ']")
List<WebElement> inCorrectCred;
public void enterContactNumber(String contact){
    contactNumber.sendKeys(contact);
}
public void enterPassword(String pass){
    password.sendKeys(pass);
}
public void clickLogin(){
    login.click();
}
public int inCorrectCredView(){
  int sizeofincorrrectcred= inCorrectCred.size();
  if(sizeofincorrrectcred==0){
      System.out.println("Element not found");
      return 0;
  }
  else {
      return sizeofincorrrectcred;
  }
}

}
