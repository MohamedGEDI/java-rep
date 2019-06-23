import java.util.Scanner;
public class pali{
      public static void main(String[] args){
      
      String[] arr = new String[5];
      
      Scanner input = new Scanner(System.in);
     
      System.out.println("put the length of your word");
      
      
      int l = input.nextInt();
      
      for(int i = 0;i<l;i++){
      
      System.out.println("enter you word");
      
      arr[i] = input.nextLine();
      
      }
      
      for(int j=0;j<l;j++){
      
      if(arr[j] == arr[l-1]){
      
      System.out.println("your word is a palindrome \n" + arr[j]);
      
      }
      else{
      
      System.out.println("your word is a palindrome \n" + arr[l-1]);
      }
      l--;
      }
      
      }



}