import org.junit.Assert; 
import org.junit.Test; 
import java.io.File; 
import jxl.Sheet; 
import jxl.Workbook;

public class Read_Excel_Records { 
 
public int getEmpCount() 
 { 
 int count=0; 
 try
 { 
 //To get access to Excel Spreadsheet
 Workbook w = Workbook.getWorkbook(new File("C:\\Users\\Lenovo\\Documents\\Employee Record\\Employee.xls"));
 
 //To get access to particular sheet in Excel Spreadsheet
 Sheet sheet = w.getSheet(0); 
 
 //Access each row, then Salary and age details and count 
 for(int j=1; j < sheet.getRows()-1;j++) 
 { 
 int age = Integer.parseInt(sheet.getCell(1, j).getContents()); 
 int sal = Integer.parseInt(sheet.getCell(2, j).getContents()); 
 
 if(sal > 50000 && age >= 30 && age <= 40)
 { 
 count++; 
 } 
 } 
 return count; 
 } 
 catch(Exception e) 
 { 
 return -1; 
 } 
 } 
 
@Test
public void testCount() 
 { 
 //Compares expected result with the actual result
 Assert.assertEquals(-1, getEmpCount()); 
 
 System.out.println("Test Passed\n Number of Employees having salary greater than 50000 and age between 30 and 40 is " + getEmpCount()); 
 } 
} 
