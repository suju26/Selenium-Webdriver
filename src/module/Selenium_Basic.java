package module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_Basic {
	//How to execute testcases in firefox browser using Selenium Webdriver
	public  void firefox() {
		// TODO Auto-generated method stub
		WebDriver firefoxdriver = new FirefoxDriver();
		firefoxdriver.get("http://www.google.com");
		System.out.println("Firefox Browser opened");
	}
	//How to execute testcases in Chrome browser using Selenium Webdriver
	public  void chrome()
	{
		//****
		System.setProperty("webdriver.chrome.driver", "E:\\browser driver\\chromedriver.exe");
		WebDriver chromedriver=new ChromeDriver();
		chromedriver.get("http://www.google.com");
		System.out.println("Chrome Browser opened");
		//chromedriver.close();
	}
	public void xpath()
	{
		//How to write Dynamic XPath in Selenium

		//Relative XPath method with Single Attribute

		WebDriver xpathdriver=new FirefoxDriver();
		xpathdriver.get("http://www.callingcards.com");
		WebElement xpath_signle=xpathdriver.findElement(By.xpath("//select[@name='origin']"));
		System.out.println("Single Attribute Xpath"+xpath_signle.getText());
		//Using multiple attribute
		WebElement xpath_multiple=xpathdriver.findElement(By.xpath("//input[@name='Search_Go'][@src='/images/index_search_btn_ver2.png']"));
		System.out.println("Multiple Xpath"+" "+xpath_multiple.getAttribute("class"));
	}
	public void internetexplorer()
	{
		System.setProperty("webdriver.ie.driver", "E:\\browser driver\\IEDriverServer.exe");
		WebDriver iedriver=new InternetExplorerDriver();
		iedriver.get("http://www.facebook.com");
					
	}

	public static void main(String args[])
	{
		Selenium_Basic ff=new Selenium_Basic();
		//ff.firefox();
		//ff.chrome();
		//ff.xpath();
		ff.internetexplorer();
	}
}
