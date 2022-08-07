import java.util.Scanner;
public class HW81{
	public static void main(String[]args){
		//gets info from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a simple expression like \"13 + 7\" (+,-,* or/).");
		//declaring variables
		int num1 = sc.nextInt();
		char symb = sc.next().charAt(0);
		int num2 = sc.nextInt();
		//conditionals to perform calculations
		if(num1==0){
			System.out.println("First Number cant be 0");
		}else if ( symb == '+'){
			System.out.println(num1 + num2);
		}else if ( symb == '-'){
			System.out.println(num1 - num2);
		}else if ( symb == '*'){
			System.out.println(num1 * num2);
		}else if ( symb == '/'){
			System.out.println(num1 / num2);
		}else if (symb != '+' || symb != '-' || symb != '*' || symb != '/'){
			System.out.println("Please use only +,-,* or/.");
		}
		
		System.out.println("End.");
	}
}