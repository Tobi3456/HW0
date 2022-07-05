import java.util.*;
import java.io.*;

public class pro3{
	public static void main(String[]args) throws Exception{
		//opening input file (put downloaded "Age" file location in "File" brackets)
		File file = new File("C:\\Users\\tobad\\Desktop\\Age.txt");
		Scanner in = new Scanner(file);
		//declaring variables
		int day = 0;
		int month = 0;
		int year =0;
		int age = 0;
		//getting current date
		Date today = new Date();
		//making the received values accurate
		int m = today.getMonth()+1;
		int d = today.getDate();
		int y = today.getYear()+1900;
		String letter =" ";
		//reading input file
		while (in.hasNext()){
			month = in.nextInt();
			day = in.nextInt();
			year = in.nextInt();
			//formula to find age
			age = y-year + (m-month) / 12; 
			if(month>m){
				age = age-1;
			}
			//changing number to letters
			if (month==1){
				letter="January";
			}else if (month==2){
				letter="Febuary";
			}else if (month==3){
				letter="March";
			}else if (month==4){
				letter="April";
			}else if (month==5){
				letter="May";
			}else if (month==6){
				letter="June";
			}else if (month==7){
				letter="July";
			}else if (month==8){
				letter="August";
			}else if (month==9){
				letter="September";
			}else if (month==10){
				letter="October";
			}else if (month==11){
				letter="November";
			}else if (month==12){
				letter="December";
			}
			System.out.println("For the "+day+" of "+letter+","+year+" your age is "+age);
		}
		in.close();
	}
}