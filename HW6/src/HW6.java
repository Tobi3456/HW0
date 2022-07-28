import java.util.Scanner;
public class HW6{
	public static void main(String[]args){
		//Calling default class Month
		Month m1 = new Month();
		//Declaring variables
		int month, year, days;
		int count=0;
		//Calling Scanner
		Scanner input = new Scanner(System.in);
		//Prompting user inputs
		System.out.print("Enter a month (1-12):");
		month = input.nextInt();
		System.out.print("Enter a year:");
		year = input.nextInt();
		//Calling Month method
		m1.setMonthNumber(month);
		//Calling MonthDays Constructor
		MonthDays md = new MonthDays(month, year);
		//Exception to check if user inputs are valid
		try  
        {  
           Month m2 = new Month(month); 
        }  
        catch (InvalidDateException ex)  
        {  
			System.out.println("Caught the exception");  
	
            System.out.println("Exception occured: " + ex);
		
			count = 1;
        } 
		//if statement that ends program if conditions arent met
		if(count==1){
			System.exit(0);
		}
		//Assigning month name value from Month class to letter	
		String letter = m1.getMonthName();
		//Exception to check if user inputs are valid
		try  
        {  
           Month m3 = new Month(letter);
        }  
        catch (InvalidDateException ex)  
        {  
			System.out.println("Caught the exception");  
			
            System.out.println("Exception occured: " + ex);  
			
			count = 1;
        } 
		//if statement that ends program if conditions arent met	
		if(count==1){
			System.exit(0);
		}
		//Finding number of days using MonthDays class	
		days = md.getNumberOfDays(month);
		//Printing all values to console
		System.out.println(letter+ " " +year+" has " +days + " days");
		
	}
	//Custom Exception Class
	static class InvalidDateException extends Exception{
		public InvalidDateException(String str)
		{
			super(str);
		}
	}
	//Month Class
	static class Month{
		//declaring variables 
		public int monthNumber=0;
		//no-arg constructor
		public Month(){
			monthNumber=1;
		}
		//Constructor that accepts the number of the month as an argument
		public Month(int x)throws InvalidDateException{
			if(x<1||x>12){
				monthNumber=1;
				throw new InvalidDateException("value is less than 1 or greater than 12");
			}else{
				monthNumber=x;
			}
		}
		//Constructor that accepts the name of the month
		public Month(String x)throws InvalidDateException{
			if(x.equals("January")){
				monthNumber=1;
			}else if(x.equals("February")){
				monthNumber=2;
			}else if(x.equals("March")){
				monthNumber=3;
			}else if(x.equals("April")){
				monthNumber=4;
			}else if(x.equals("May")){
				monthNumber=5;
			}else if(x.equals("June")){
				monthNumber=6;
			}else if(x.equals("July")){
				monthNumber=7;
			}else if(x.equals("August")){
				monthNumber=8;
			}else if(x.equals("September")){
				monthNumber=9;
			}else if(x.equals("October")){
				monthNumber=10;
			}else if(x.equals("November")){
				monthNumber=11;
			}else if(x.equals("December")){
				monthNumber=12;
			}else{
				throw new InvalidDateException("Invalid date");
			}
		}
		//setMonthNumber method
		public void setMonthNumber(int x){
			if(x<=1||x>=12){
				monthNumber=1;
			}else{
				monthNumber=x;
			}
		}
		//getMonthNumber method
		public int getMonthNumber(){
			return monthNumber;
		}
		//getMonthName method
		public String getMonthName(){
			switch (monthNumber) {
            case 1:  return "January";
            case 2:  return  "February";
            case 3:  return "March";
            case 4:  return "April";
            case 5:  return "May";
            case 6:  return "June";
            case 7:  return "July";
            case 8:  return "August";
            case 9:  return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Invalid month";
			}
		}
		//toString method
		public String toString(){
			return getMonthName();
		}
		//equals method
		public boolean equals(Month x){
			if(this.monthNumber == x.getMonthNumber()){
				return true;
			}else{
				return false;
			}
		}
	}
	//MonthDays Class
	static class MonthDays extends Month{
		//declaring variables
		public int month =0;
		public int year =0;
		public int days=0;
		//constructor should accept two arguments
		public MonthDays(int x , int y){
			month = x;
			year = y;
		}
		//method named getNumberOfDays
		public int getNumberOfDays(int x) {
			if (x == 2) {
				if ((year % 100 == 0) && (year % 400 == 0) || (year % 4 == 0) && !(year % 100 == 0)){
					days = 29;
				}else{
					days = 28;
				}
			}else if (x == 1 || x == 3 || x == 5|| x == 7 || x == 8 || x == 10|| x == 12){
				days = 31;
			}	
			else{
				days = 30;
			}
			return days;
		}
	}
}