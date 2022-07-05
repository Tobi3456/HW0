import java.util.*;
import java.io.*;

public class pro1{
	//made the method an int to return sum
	public static int factorial(int n){
		int sum = n;
		//formula to find factorial of n
		for (int i=1; i<n; i++){
			sum = sum*i;
		}
		return sum;
	}
	//made the method an int to return sum
	public static int sumOfSquares(int n){
		int sum = 0;
		//formula to find sum of squares of n
		for (int i =1; i<=n; i++){
			sum= sum +(i*i);
		}
		return sum;
	}
	//made the method a string to return a sequence of numbers
	public static String fibonacci(int n){
		//initializing variables
		int sum = 1;
		int temp = 0;
		int fn = 0;
		String arr[] = new String[n];
		//making a loop for the sequence
		for (int i =0; i<n; i++){
			fn = temp + sum;
			temp = sum;
			sum = fn;
			//array to store sequence
			arr[i]= Integer.toString(fn);
		}
		//converting array to string so i can print it to output file
		return Arrays.toString(arr);
	}
	
	public static void main (String[]args) throws Exception{
		//opening/reading/creating files(put downloaded "input" file location in "File" brackets)
		File file = new File("C:\\Users\\tobad\\Desktop\\input.txt");
		Scanner in = new Scanner(file);
		//put desired output location in PrintStream brackets
		PrintStream output = new PrintStream("C:\\Users\\tobad\\Desktop\\output.txt");
		
		int first=0;
		int second=0;
		int third=0;
		//reading input file
		while(in.hasNext()){
			first = in.nextInt();
			second = in.nextInt();
			third= in.nextInt();
			//skips extra input not being used
			in.nextInt();
			in.nextInt();
		}
		//prints values to output file
		output.println("The factorial of " +first+ " is " +factorial(first));
		output.println("The sum of squares " +second+ " is " +sumOfSquares(second));
		output.println(fibonacci(third));
		
		in.close();
		output.close();
	}
	
}
		