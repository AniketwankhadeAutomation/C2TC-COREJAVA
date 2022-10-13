package Practise;

import java.util.Scanner;

public class Evenodd2 {
	
	public static void main(String[] args) {
		
		int num;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter no");
	num=sc.nextInt();
	
	if(num%2==0)
	{
		System.out.println("even no");
	}
	else
	{
      System.out.println("odd no");
	}

 }
}
