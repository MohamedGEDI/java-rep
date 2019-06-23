import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
  
public class BufferedReaderExample
 {  
    public static void main(String args[])throws Exception
       {    
         
       FileReader fr=new FileReader("seminar.txt"); 
          
          BufferedReader br=new BufferedReader(fr);    
        
         String letters;
          
          
          int i;    
          while((i=br.read())!=-1)
          {  
           if (Character.isDigit(i)) {
                System.out.println(i);
       }//   System.out.println((char)i);  
        
          }  
          br.close();    
          fr.close();    
    }    
}  