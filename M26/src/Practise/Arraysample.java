package Practise;

import java.util.Scanner;

public class Arraysample {
	
	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of the array=");
		
		Scanner s= new Scanner(System.in);
		size=s.nextInt();
		
		int [] arr = new int[50];
		System.out.println("Enter the Elments");
		
		for(int i =0; i<size; i++)
		{
			arr[i]= s.nextInt();
		}
		System.out.println("Your array is here=");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}
	} 

}
