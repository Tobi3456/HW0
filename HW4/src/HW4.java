import java.util.*;

public class HW4{
	public static void basicArray(){
		//creating array
		int[]nums = new int [50];
		//incrementing by tens
		for(int i=0;i<nums.length;i++){
			nums[i]=(i+1)*10;
		}
		//printing array
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
	
	public static void printElements(String[]arr){
		//printing array
		for(int i=0;i<arr.length;i++){
			String word = arr[i];
			System.out.print(word+" ");
			//getting length of elements
			System.out.println(word.length()+" ");
		}
	}
	
	public static void printElements(int[][]arr){
		//printing 2d array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
	}
	
	public static void printElements(Date[]arr){
		//printing date objects
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main (String[]args){
		//declaring array
		String[]wordsList={"first","second","third", "fourth", "fifth","sixth","seventh","eighth","ninth","tenth"};
		printElements(wordsList);
		//declaring time objects
		Date[]timeList= {new Date(),new Date(),new Date()};
		printElements(timeList);
		//declaring 2d array
		final int[][] values = {
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
			{ 1, 2, 3,4,5,6,7,8,9,10 },
		};
		int columns=0;
		int rows=0;
		//finding rows
		for (int i = 0; i < values[0].length; i++) {
			rows++;
		}
		System.out.println("rows = "+rows);
		//finding columns
		for (int i = 0; i < values.length; i++) {
			columns++;
		}
		System.out.println("columns = "+columns);
		//printing 2d array
		printElements(values);
	}
}