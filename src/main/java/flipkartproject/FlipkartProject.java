package flipkartproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.Duration;

import org.apache.commons.lang3.time.DurationUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class FlipkartProject {
	static WebDriver driver;
	
	static long timeon;
	static String text1;
	static String text2;
	static String text3;
	static String text4;
	static String text5;static String text6;static String text7;
@BeforeClass
	public static void BrowserLunch() {
WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
options.addArguments("start-maximized");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.flipkart.com/");
	}
@AfterClass
public static void Browserquit() {
driver.quit();
}
public  void timeon() {
	 timeon=System.currentTimeMillis();
	
}
public  void timeoff() {
long timeoff=System.currentTimeMillis();	
System.out.println("Time taken"+(timeoff-timeon) );
}
@Test
public  void main1() throws InterruptedException, AWTException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
}
@Test
public  void main2() throws IOException, InterruptedException {
driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OPPO mobile",Keys.ENTER);
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	WebElement acc = driver.findElement(By.xpath("//input[@type='text']"));
	a.moveToElement(acc);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement mobile1=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[1]"));
text1=mobile1.getText();
	
	WebElement mobile2=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[2]"));
	text2=mobile2.getText();
	
	WebElement mobile3=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[3]"));
text3=mobile3.getText();
	
	WebElement mobile4=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[4]"));
text4=	mobile4.getText();
	
	WebElement mobile5=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[5]"));
	text5=mobile5.getText();
	
	WebElement mobile6=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[6]"));
	text6=mobile6.getText();
	
	WebElement moblie7=	driver.findElement(By.xpath("(//div[contains(text(),'OPPO K')])[7]"));
text7=moblie7.getText();
	File file= new File("C:\\Users\\pratheep.km\\eclipse-workspace\\flipkartproject\\target\\mobiles.xlsx");
  FileOutputStream f1= new FileOutputStream(file);
  XSSFWorkbook workbook=new XSSFWorkbook();
    XSSFSheet sheet=workbook.createSheet("mobile");
    
    XSSFRow row=sheet.createRow(0);
    XSSFCell cell=row.createCell(0);
    cell.setCellValue("mobile List");
    
    XSSFRow rowprize=sheet.createRow(1);
    XSSFCell cellprize=rowprize.createCell(0);
    cellprize.setCellValue("prize");
    
    XSSFRow row1=sheet.createRow(0);
    XSSFCell cell1=row1.createCell(0);
    cell1.setCellValue(text1);
    
    XSSFRow rowprize1=sheet.createRow(1);
    XSSFCell cellprize1=rowprize1.createCell(1);
    cellprize1.setCellValue("₹16,499");
    
    XSSFRow row2=sheet.createRow(0);
    XSSFCell cell2=row2.createCell(2);
    cell2.setCellValue(text2);
    
    XSSFRow rowprize2=sheet.createRow(1);
    XSSFCell cellprize2=rowprize2.createCell(2);
    cellprize2.setCellValue("₹17,499");
    
    XSSFRow row3=sheet.createRow(0);
    XSSFCell cell3=row3.createCell(3);
    cell3.setCellValue(text3);
    
    XSSFRow rowprize3=sheet.createRow(1);
    XSSFCell cellprize3=rowprize3.createCell(3);
    cellprize3.setCellValue("₹14,999");
    
    XSSFRow row4=sheet.createRow(0);
    XSSFCell cell4=row4.createCell(4);
    cell4.setCellValue(text4);
    
    XSSFRow rowprize4=sheet.createRow(1);
    XSSFCell cellprize4=rowprize4.createCell(4);
    cellprize4.setCellValue("₹14,990");
    
    XSSFRow row5=sheet.createRow(0);
    XSSFCell cell5=row5.createCell(5);
    cell5.setCellValue(text5);
    
    XSSFRow rowprize5=sheet.createRow(1);
    XSSFCell cellprize5=rowprize5.createCell(5);
    cellprize5.setCellValue("₹17,500");
    
    XSSFRow row6=sheet.createRow(0);
    XSSFCell cell6=row6.createCell(6);
    cell6.setCellValue(text6);
    
    XSSFRow rowprize6=sheet.createRow(1);
    XSSFCell cellprize6=rowprize6.createCell(6);
    cellprize6.setCellValue("₹17,000");
    
    XSSFRow row7=sheet.createRow(0);
    XSSFCell cell7=row7.createCell(7);
    cell7.setCellValue(text7);
    
    XSSFRow rowprize7=sheet.createRow(1);
    XSSFCell cellprize7=rowprize7.createCell(7);
    cellprize7.setCellValue("₹13,499");
    workbook.write(f1);
}

}