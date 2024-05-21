import java.io.File; 
import java.io.IOException; 
import jxl.Workbook; 
import jxl.write.Label; 
import jxl.write.Number; 
import jxl.write.WritableSheet; 
import jxl.write.WritableWorkbook; 
import jxl.write.WriteException; 
import jxl.write.biff.RowsExceededException; 
public class Update_Excel_Records { 
public static void updateFile() throws IOException, RowsExceededException, WriteException
 { 
//
 WritableWorkbook workbook = Workbook.createWorkbook(new File("C:\\Users\\Lenovo\\Documents\\Employee Record\\Update.xlsx")); 
workbook.createSheet("Student", 0); 
 
 //To get access to sheet which we want to update
 WritableSheet excelSheet = workbook.getSheet(0); 
 
 //Creates 3 headers for 3 Columns
 Label h1 = new Label(0,0, "Student Name"); 
 excelSheet.addCell(h1); 
 
 Label h2 = new Label(1,0, "Marks 1"); 
 excelSheet.addCell(h2); 
 
 Label h3 = new Label(2,0, "Marks 2"); 
 excelSheet.addCell(h3); 
 
 //Update Student name, Marks 1 and Marks 2 by accessing cells in each row.
 for(int i=1;i<=10;i++) 
 { 
 Label lbl = new Label(0,i, "Student " + i); 
 excelSheet.addCell(lbl); 
 
 Number S1 = new Number(1,i, 10); 
 excelSheet.addCell(S1); 
 
 Number S2 = new Number(2,i, 10); 
 excelSheet.addCell(S2); 
 } 
 
 //Writes to Workbook 
 workbook.write(); 
 
 //Closes the Workbook
 workbook.close(); 
 System.out.println("File created with 10 Student records"); 
 } 
 public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
 { 
 updateFile(); 
 } 
} 