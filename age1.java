import java.util.Scanner;
class age1{
       public static void main(String[] arg){
       
       
       
       int j;
       Scanner input = new Scanner(System.in);
       int age = input.nextInt();
       
       
       for(int i=0;i<=age;i++){
       int num = 0;
       for(j=i;j>1;j--){
       
       if(i%j==0){
       num = num + 1;
       }
       }
       if(num == 1){
       System.out.println(i);
       }
       }
       
       
       }
}


