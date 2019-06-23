import java.util.Scanner;
import java.io.*;

public class Lab4Quest2 {
	public static void main(String[] args) throws IOException{
		File file = new File("seminar.txt");
		Scanner input = new Scanner(file);
		String integer;
		int count = 0;
		System.out.println("Integers: ");
		
		while (input.hasNext()){
		integer = input.nextLine();
		System.out.println(integer);
		count++;
		}
		System.out.println("Total integers: " + count);
	}
}