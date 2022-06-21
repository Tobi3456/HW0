import java.io.*;
import java.util.*;
public class HW {

	public static void main(String[] args) throws Exception{
		//Opening input file(put the downloaded File.txt location in bracket below)
		File file = new java.io.File("C:\\Users\\tobad\\Desktop/File.txt");
		Scanner inputFile = new Scanner(file);
		//Making a new file (put desired location of new file in bracket)
		PrintStream outputFile = new PrintStream("C:\\Users\\tobad\\Desktop/Result.txt");
		
		//Initializing variables to hold values
		String date;
		int sku;
		double price;
		double discountpc;
		double sum = 0;
		double discount = 0;
		int min = 0;
		int max = 0;
		int min1 = 0;
		int max1 =0;
		
		//Feeding values into the variables	
		int i = 0;
		while(inputFile.hasNext()) {
			//skips title line
			inputFile.nextLine();
			//reads content of file
			date = inputFile.next();
			sku = inputFile.nextInt();
			price  = inputFile.nextDouble();
			discountpc = inputFile.nextDouble();
			//discount formula
			discount = ((price) - ((price)*(discountpc/100)));
			i++;
			//Finding min and max numbers
			if(i==1) {
				max = (int)(discount);
				min = (int)(discount);
				max1 = sku;
				min1 = sku;
			}
			max = Math.max(max, (int)(discount));
			min = Math.min(min, (int)(discount));	
			max1 = Math.max(max1, sku);
			min1 = Math.min(min1, sku);
			//calculating the total
			sum = sum + discount;
		}
		
		//Finding tax
		double tax =  ((sum)*(8.875/100)) ;
	
		//Printing new values in output file
		outputFile.println("Report from 01-09 to 01-13");
		outputFile.println("The total is $" + sum);
		outputFile.printf("The tax is $%.2f %n" , tax);
		outputFile.println("The highest price item is #" + max1+ " at $" + max);
		outputFile.println("The lowest price item is #" + min1+ " at $" + min);
			
		//Completed
		System.out.println("The report is completed. The filename is Result.txt");
			
		outputFile.close();	
		inputFile.close();	
	}

}
