package externalFiles;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class RandomNumbers {
	
public static void main(String[] args) {
	
	System.out.println("Please give me a number which will be the smallest number in the range of 500 random numbers");
	Scanner ui = new Scanner(System.in);
	int abc = ui.nextInt();
	System.out.println(abc + " is the number you have input");

		Random rn = new Random();
		int[] num = new int[500];
		for(int i=0;i<500;i++) {
			num[i]= rn.nextInt(999-abc+1)+abc;
		}
			Arrays.sort(num);
			for(int item:num) {
			System.out.println(item);	
			}
			System.out.println(num[0] + " is the smallest number in the list of 500 random numbers. Run the program to try again.");		
		}	
}


	
				
					
		






