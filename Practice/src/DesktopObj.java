//import java.io.*;
//
//public class DesktopObj{
//	public static void main(String[] args)
//	{
//		try {
//			Runtime.getRuntime().exec("wscript C:\\Users\\Lenovo\\Documents\\count.vbs");
//		} catch (IOException e) {
//			System.exit(0);
//		}
//	}
//}
import java.io.*;

public class DesktopObj{
	public static void main(String[] args)
	{
		try{
			Runtime.getRuntime().exec("wscript C:\\Users\\Lenovo\\Documents\\count.vbs");
		}
		catch(IOException e)
		{
			System.exit(0);
		}
	}
}

















/*
Set fso = createobject("Scripting.FileSystemObject") 
DesktopPath = CreateObject("WScript.Shell").SpecialFolders("Desktop") 
msgbox "The number of files on the desktop is : "GetFolder(DesktopPath).Files.Count 
'Folders count msgbox "The number of folders on the desktop is : "&fso.GetFolder(DesktopPath).SubFolders.Count 
*/