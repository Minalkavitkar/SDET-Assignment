package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateClass {
	public WebDriver driver;
@Given("user should have launched the application")

	public void user_should_have_launched_the_application() {
	    WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://elearning.upskills.in/");
}

@When("user should have logged in as admin and present in home screen")
public void user_should_have_logged_in_as_admin_and_present_in_home_screen() {
	
    driver.findElement(By.id("login")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("admin@123");
    driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
}


@When("click on administration tab")
public void click_on_administration_tab() {
	 driver.findElement(By.xpath("//a[contains(text(),'Administration')]")).click();
}
    

@When("click on classes link")
public void click_on_classes_link() {
	 driver.findElement(By.xpath("//a[contains(text(),'Classes')]")).click();
}

@When("click on add classes icon")
public void click_on_add_classes_icon() {
	driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/a[2]/img[1]")).click();
}

@When("Enter valid credentials")
public void enter_valid_credentials() {
	driver.findElement(By.xpath("//input[@id='usergroup_name']")).sendKeys("Minal_K");
	driver.findElement(By.xpath("//textarea[@id='usergroup_description']")).sendKeys("Minal_CLass12345");
	Select GroupPermission = new Select(driver.findElement(By.id("usergroup_visibility")));
	GroupPermission.selectByValue("1");
    
}

@When("Click on add button")
public void click_on_add_button() {
	driver.findElement(By.xpath("//button[@id='usergroup_submit']")).click();
  
}

@Then("Item added message should get display")

	public void item_added_message_should_get_display() {
		WebElement msg=driver.findElement(By.xpath("//div[contains(text(),'Item added')]"));
		String text=msg.getText();
		if (msg.isEnabled() && text.contains("Item added"))
		{ 
		    System.out.println("Successfully added");
		}else{
		    System.out.println("Please enter all details");
		}
}

}
