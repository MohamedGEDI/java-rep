import java.util.Scanner;

public class Discussion{
     Scanner input = new Scanner(System.in);
     
     int group;
     String[] names = new String[group];
     int[] age = new int[group];
     int[] height = new int[group];
     
    
     public void classList(){
     
     System.out.println("enter the number of people");
     int group = input.nextInt();
     
       for(int i = 0; i<group;i++){
       System.out.println("enter the " + (i+1) + " member's name age and height respectively");
       names[i] = input.next();
       
       age[i] = input.nextInt();
       
       height[i] = input.nextInt();
       }
       for(int i = 0;i<group;i++){
       System.out.println(names[i] + "\t" + age[i] + "\t" + height[i]);
       
       }
     }
     
         
     
     public static void main(String[] arg){
     
     Discussion jack = new Discussion();
     
     jack.classList();
     
        
     }
  }