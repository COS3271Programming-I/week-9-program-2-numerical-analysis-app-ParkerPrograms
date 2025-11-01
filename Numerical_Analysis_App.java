package Week_9;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class Numerical_Analysis_App {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:\\Users\\Boyum\\Desktop\\Text_File_for_Numerical_Analysis_App.txt";
		File textFile = new File(fileName);
		Scanner in = new Scanner(textFile);
		String all;
		double largest = 0;
		double smallest = 1000000000;
		String number;
		float x;
		double sum = 0;
		
		all = in.nextLine();
		//count the quantity of decimal numbers
		int decimals = all.length()/10;
		
		for (int i=0; i<all.length(); i+=10) {
			number = all.substring(i, i+9);
			x = Float.parseFloat(number.trim());
			//find the largest number
			if (x > largest) {
				largest = x;
			}
			//find the smallest number
			if (x < smallest) {
				smallest = x;
			}
			//add up each number for the average
			sum += x;
		}
		in.close();
		
		double average = sum / decimals;
		double range = largest - smallest;
		
		System.out.println("Quantity of numbers: " + decimals);
		System.out.format("Average: %.2f\n", average);
		System.out.format("Largest number: %.2f\n", largest);
		System.out.format("Smallest number: %.2f\n", smallest);
		System.out.format("Range: %.2f\n", range);
		
	}
}
