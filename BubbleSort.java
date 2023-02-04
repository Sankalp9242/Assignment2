package DSA;

public class BubbleSort {
	public static void main(String[] args) {
		int temp=0;
		int arr[]= {540,320,660,550,325,758,6870,990};
		for (int i = 0; i <arr.length; i++) 
		{
			for (int j = 0; j <arr.length-1; j++)
			{
				
			
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;	
			}
		}
			
		}
		for (int i : arr) {
			System.out.println(i);
			
		}
	}

}
