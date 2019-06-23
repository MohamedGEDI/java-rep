import java.util.Scanner;

public class palin{
     public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
          
     int num;
     int cons;
     int real=0; 
     int[] real = new int[num];
        
     
     System.out.println("enter the number ");
     
     num = input.nextInt();
     
     for(int i=0;i<=5;i++){
     
     cons = num%10;
     if(num < 10){
     
     cons = num;
     }
     if(num == 0){
     break;
     }
    // cons = 0;
    
    System.out.println(cons + "\t" + real);
   num = num/10;
   real = (real*10) + cons;
   
  
            }
     if(num == real) {      
     
     System.out.println("end result" + real);
     System.out.println("this is a palindrome");;
     }
     else{
     
     System.out.println("end result" + real);
     System.out.println("this is not a palindrome");
     }
     }

}