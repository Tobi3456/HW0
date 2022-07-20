import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;

public class HW5{
	//distance method
	public static String distance(int speed, int time){
		//declaring variables
		int distance = 0;
		String y ="";
		String head="";
		String line="";
		String s ="";
		//conditional to meet requirements
		if(speed>=0 || time>=1){
			head = "Hour         Distance Traveled";
			line = "------------------------------";
			//for loop to find distance of each input
			for(int i=1;i<=time;i++){
				distance=speed * i;
				y = Integer.toString(i);
				s += y+"               "+Integer.toString(distance)+"\n";
			}
		}else{
			return "Do not enter a negative number for speed or do not enter any value less than 1 for time traveled.";
		}
		//return statement that prints report
		return head+"\n"+line+"\n"+s;
	}
	//saveAsFile method
	public static void saveAsFile(String fn)throws Exception{
		//opens downloaded file (put downloaded file location in " ")
		File file = new File("C:\\Users\\tobad\\Desktop\\info.txt");
		Scanner sc = new Scanner(file);
		//creates a new file on desktop 
		PrintStream out = new PrintStream("C:\\Users\\tobad\\Desktop\\"+fn);
		//declaring variables
		String vc = " ";
		String speed = " ";
		String time =" ";
		int distance=0;
		//using delimiters to remove commas
		sc.useDelimiter(",");
		//reading file 
		while(sc.hasNext()){
			sc.nextLine();
			vc = sc.next();
			speed = sc.next();
			time = sc.next();
			//creating a conditional to only print distance method to matching vechiles
			if(fn.equals(vc+".txt")){
			//calculating the distance
				out.println(distance(Integer.valueOf(speed),Integer.valueOf(time)));
			}
		}
		out.close();
	}
	
	public static void main(String[]args)throws Exception{
		//opens downloaded file (put downloaded file location in " ")
		File file = new File("C:\\Users\\tobad\\Desktop\\info.txt");
		Scanner sc = new Scanner(file);
		//declaring string
		String vc = " ";
		//using delimiters to remove commas
		sc.useDelimiter(",");
		//reading file 
		while(sc.hasNext()){
			sc.nextLine();
			vc = sc.next();
			sc.next();
			sc.next();
			//calling saveAsFile method
			saveAsFile(vc+".txt");
		}
		
		sc.close();
	}
}
