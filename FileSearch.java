
import java.util.*;
import java.io.*;
public class FileSearch {
	public static void main(String args[]){
		System.out.println("Enter the File name : ");
		Scanner input = new Scanner(System.in);
		String s=input.nextLine();
		File f1=new File(s);
		System.out.println("File "+(f1.exists()?"Exist":"Does not Exist"));
		System.out.println("FileName is : "+f1.getName());
		System.out.println("Path : "+f1.getPath());
		System.out.println("Absolute Path : "+f1.getAbsolutePath());
		System.out.println("HashCode : "+f1.hashCode());
		System.out.println("Parent File : "+f1.getParent());
		System.out.println("Total Space : "+f1.getTotalSpace());
		System.out.println("Usable Space : "+f1.getUsableSpace());
		System.out.println("Free Space : "+f1.getFreeSpace());
		System.out.println("Length : "+f1.length());
		System.out.println("Last Modified : "+f1.lastModified());
		System.out.println("Writtable : "+f1.canWrite());
		System.out.println("Readable : "+f1.canRead());
		System.out.println("Executable : "+f1.canExecute());
	}
}
