package DSA;

import java.util.Scanner;

public class DuplicateElementsInAnArray {
	public static void main(String[] args) 
	{
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array=");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
			System.out.print("Array elements are=");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+",");	
		}
			System.out.println();
			System.out.print("Duplicate elements in an array :");
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					System.out.print(arr[i]+",");	
				}	
			}	
		}
		if(flag==false) {
			System.out.println("No duplicate elements found in an array");	
		}
		sc.close();
	}

}
