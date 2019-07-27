package TangentFunction;

import java.util.Scanner;

public class Run {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the angle:");
		String line=sc.nextLine();
		sc.close();
		
 		TangentFunction tan=new TangentFunction();
 		String result= tan.tangent(line);
 		System.out.println(result);
	}
}
