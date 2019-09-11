package org.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen  {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Scren\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		//type cast
		TakesScreenshot tk=(TakesScreenshot)driver;
		//Tempt
		File a=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(a);
		//d
		File d =new File("C:\\Users\\Lenovo\\Scren greens.png");
		Fileutils.copyFile (a,d);
		System.out.println(d);
		driver.close();
		
	}

}
