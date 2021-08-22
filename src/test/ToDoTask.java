package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.TodoListPage;

public class ToDoTask {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Chrome_Driver\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://localhost:8080/");
	driver.manage().window().maximize();
	String toDoItem = "Brush Your Teeth" ;
	
	TodoListPage todoPageObject = new TodoListPage (driver);
	
	// Create To Do Item
	todoPageObject.createToDoItem(toDoItem);
	
	// Delete To Do Item
	todoPageObject.deleteToDoItem(toDoItem);
	
	driver.close();

	
	}

}
