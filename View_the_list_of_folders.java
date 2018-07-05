import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class View_the_list_of_folders { 
   public static void main(String[] args) throws IOException {
      System.out.println("Enter the path to folder to search for files");
      Scanner s1 = new Scanner(System.in);
      String folderPath = s1.nextLine();
      File folder = new File(folderPath);
      
      if (folder.isDirectory()) {
         File listOfFiles[] = folder.listFiles();
         if (listOfFiles.length < 1){
        	 System.out.println("There is no File inside Folder");
        	 }
         
         else{
        	 System.out.println("List of Files & Folder");
         }
         
         for (File file : listOfFiles) {
            if(!file.isDirectory()){
               System.out.println(
               file.getCanonicalPath().toString());}
         } 
      } 
      else System.out .println("There is no Folder @ given path :" + folderPath);
   }
}
