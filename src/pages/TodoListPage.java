package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodoListPage {
	
	WebDriver driver;
	
	By header = By.xpath("//h1[text()='Simple ToDo List ']");
	By txtToDo = By.xpath("//input[@type='text']");
	By lblTodoCount = By.xpath("//h1/span");
	By btnAddTodo = By.xpath("//button[text()='Add']");
	String toDoItem = "";
	By deletItem = By.xpath("//label[contains(., 'param')]/input".replace("param", toDoItem));
	
	
	public TodoListPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// Create To Do Item
	public void createToDoItem(String toDoText) throws InterruptedException {
		
		driver.findElement(txtToDo).sendKeys(toDoText);
		driver.findElement(btnAddTodo).click();
		Thread.sleep(3000);
	}
	
	// Delete To Do Item
	public void deleteToDoItem(String toDoText) throws InterruptedException {
		
		driver.findElement(deletItem).click();
		Thread.sleep(3000);
	}
	
	
}



