package DSA;

public class SelectionSort
{
	public static void main(String[] args) {
		int temp=0;
		int arr[]= {20,39,40,10,32,11,40,43};
		for (int i = 0; i < arr.length; i++) 
		{
			int min=i;
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
	}
	

}
