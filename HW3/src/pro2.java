import java.util.*;

public class pro2{
	public static void main(String[]args){
		//asking for user input
		Scanner in = new Scanner(System.in);
		System.out.println("Choose a shape from the following:");
		System.out.println("Square, Rectangle, Circle");
		String answer = in.next();
		//making user input uppercase so its not case sensitive
		String upper = answer.toUpperCase();
		String s = "SQUARE";
		String r = "RECTANGLE";
		String c = "CIRCLE";
		//first conditional to find area/peri/circ of shape
		if (upper.equals(s)){
			System.out.println("What is the length of square?");
			int length = in.nextInt();
			
			int area = length*length;
			int peri = 4*(length);
			
			System.out.println("The area of your square is "+area+" and the perimeter is "+peri);
		}//second conditional to find area/peri/circ of shape
		else if (upper.equals(r)){
			System.out.println("What is the length of rectangle?");
			int length = in.nextInt();
			System.out.println("What is the width of rectangle?");
			int width = in.nextInt();
			
			int area = width * length;
			int peri = 2*(width + length);
			
			System.out.println("The area of your rectangle is "+area+" and the perimeter is "+peri);
		}//third conditional to find area/peri/circ of shape
		else if (upper.equals(c)){
			System.out.println("What is the radius of circle?");
			double radius = in.nextDouble();
			double pi = 3.14;
			
			double area = (pi)*(radius*radius);
			double circ = (2)*(pi)*(radius);
			
			System.out.printf("The area of your circle is "+area+" and the circumference is "+ "%.2f\n",circ);	
		}else{
			//condition if a shape from the options isnt chosen
			System.out.println("You entered an invalid shape!");
		}
		
	}
}