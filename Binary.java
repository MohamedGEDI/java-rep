import java.util.Scanner;
public class Binary
{
     public static void main(String[] arg)
     {
     Scanner input = new Scanner(System.in);
     
     int[] bin = new int[8];
     int[] reverse = new int[8];
     
     int counter;
     int remainder;
     
     System.out.println("enter a number");
     
     int num = input.nextInt();
     
     for(int i = 0;i<num;i++){
     
     bin[i] = num%2;
     
   num = num/2;
      
      if(num == 1){
      
      bin[i] = num;
      }
     
     }
       
     for(int j = 7;j>=0;j--){
     
     int i = 0;
     
     reverse[i] = bin[j];
     
     i++;
     
     
     
     }     
     
     for(int k = 0; k<8;k++){
     
     
     System.out.print(reverse[k]);
     }
     
     







     }

}