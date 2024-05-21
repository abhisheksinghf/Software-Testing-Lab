import java.io.*; 
public class countitems
{ 
public static void main(String[ ] args) 
{ 
try
{ 
Runtime.getRuntime().exec("wscript C:\\Users\\Lenovo\\Documents\\count.vbs"); 
} 
catch (IOException e) 
{ 
System.exit(0); 
} 
} 
}