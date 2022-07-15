package org.datatable;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks2 {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		List<WebElement> lists = driver.findElements(By.tagName("a"));

		System.out.println("no of links in a webpage " + lists.size());
		int size = lists.size();
		int count = 0;
		for (int i = 0; i < lists.size(); i++) {
			WebElement list = lists.get(i);
			String attribute = list.getAttribute("href");
			URL url = new URL(attribute);
			URLConnection OpenConnection = url.openConnection();
			HttpURLConnection connection = (HttpURLConnection) OpenConnection;
			int responseCode = connection.getResponseCode();
			
			if (responseCode > 400 && responseCode < 500) {

				count++;
				System.out.println(attribute + "Brokenlink");

			}

		}
		System.out.println(count);
		driver.close();

	}

}
