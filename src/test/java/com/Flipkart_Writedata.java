package com;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
import java.time.Duration;
import java.util.List;
	import java.util.ListIterator;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class Flipkart_Writedata {
		public static void main(String[] args) throws InterruptedException, Throwable  {
		
		File f =new File("");
		FileInputStream fis =new FileInputStream(f);
		Workbook w =new XSSFWorkbook(fis);
		
		Sheet s = w.getSheet("Sheet1");
		
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK\']")).sendKeys("mobiles");
	driver.findElement(By.xpath("//button[@type='submit\']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col col-7-12']/div[1]")));
	//Thread.sleep(3000);
	List<WebElement> select = driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='_4rR01T\']"));
	System.out.println(select.size());

	//ListIterator<WebElement> name=select.listIterator();
	//while(name.hasNext()){

	ListIterator<WebElement> name=select.listIterator();
	while(name.hasNext()){
		System.out.println(name.next().getAttribute("innerHTML"));
		


	for (WebElement e : select) {
	int a =0;

	Row r = s.createRow(0);
	//Row row = s.getRow(a++);
	Cell cell = r.createCell(0);
	}
	FileOutputStream fos =new FileOutputStream(f);
	w.write(fos);

	}



	}
	
	

	

	}


