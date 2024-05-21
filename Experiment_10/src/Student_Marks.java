import org.junit.Assert; 
import org.junit.Test; 
import java.io.File; 
import jxl.Sheet; 
import jxl.Workbook; 

public class Student_Marks { 
 
public int getStudCount() 
 { 
 int count=0; 
 try
 { 
 //To get access to Excel Spreadsheet
 Workbook w = Workbook.getWorkbook(new File("C:\\Users\\Lenovo\\Documents\\Employee Record\\Student_Marks.xlsx"));
 
 //To get access to particular sheet in Excel Spreadsheet
 Sheet sheet = w.getSheet(0); 
 
 //Access each row, then Salary and age details and count 
 for(int j=1; j < sheet.getRows();j++) 
 { 
 int m1 = Integer.parseInt(sheet.getCell(1, j).getContents()); 
 int m2 = Integer.parseInt(sheet.getCell(2, j).getContents()); 
 
 if(m1 >= 60 || m2 >= 60) 
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
 Assert.assertEquals(6, getStudCount()); 
 
 System.out.println("Test Passed\n Number of students scored more than 60 marks in any one of the subject is " + getStudCount()); 
 } 
} 
