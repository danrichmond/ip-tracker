package iptracker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IPTracker {
	public WebDriver driver;
	String driverPath = "chromedriver";
	public String baseUrl = "http://www.ip-tracker.org/";
	WebElement continent;
	WebElement country;
	WebElement state;
	WebElement city;
	WebElement coordinates;
	
  @Test
  public void iPLocation() {
	  try {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver = new ChromeDriver();
		  driver.get(baseUrl);
		  WebElement ipInput = driver.findElement(By.xpath("//*[@id=\"txtOne\"]"));
		  ipInput.sendKeys("69.252.207.71"); ///// Update IP Here
		  WebElement enterButton = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/form/table/tbody/tr[2]/td/input"));
		  enterButton.click();
		  continent = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/table/tbody/tr[3]/td[2]/table/tbody/tr[7]/td"));
		  country = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/table/tbody/tr[3]/td[2]/table/tbody/tr[8]/td"));
		  state = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/table/tbody/tr[3]/td[2]/table/tbody/tr[10]/td"));
		  city = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/table/tbody/tr[3]/td[2]/table/tbody/tr[11]/td"));
		  coordinates = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/table/tbody/tr[3]/td[2]/table/tbody/tr[26]/td"));
		  System.out.println("\n-----------------------------");
		  System.out.println("---------- Details ----------");
		  System.out.println("-----------------------------");
		  System.out.println("Continent: " + continent.getText());
		  System.out.println("County: " + country.getText());
		  System.out.println("State: " + state.getText());
		  System.out.println("City: " + city.getText());
		  System.out.println("Coordinates: " + coordinates.getText() + "\n");
		  driver.close();
	  } catch(Exception e) {
		  e.printStackTrace();
	  }
  }
}
