import java.util.Scanner;
class fibo{
   public static void main(String[] arg){
   
   int x=0;
   int y=0;
   int z=0;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("enter your fibonacci limit");
   int lim = input.nextInt();
   System.out.println("the fib goes like this");
   for(int i=0;i<=lim;i++){
   if(y==0){
   y=1;
   z=1;
   }
   x = y + z;
   z=y;
   y=x;
   System.out.println(x);
   }
   
   }

}