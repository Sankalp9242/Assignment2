package DSA;


class Demo
{
	public static void divide(int arr[],int si,int ei)
	{
		if(si>=ei)
		{
			return;
		}
		int mid=(si+ei)/2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conquer(arr,si,mid,ei);
		
	}
	public static void conquer(int arr[],int si,int mid,int ei)
	{
		int merged[]=new int[ei-si+1];
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while (idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<=arr[idx2])
			{
				merged[x++]=arr[idx1++];
			}
			else {
				merged[x++]=arr[idx2++];
			}
			
		}
		while (idx1<=mid) {
			merged[x++]=arr[idx1++];
			
		}
		while (idx2<=ei) {
			merged[x++]=arr[idx2++];
			
		}
	
		int i=0,j=si;
		while (i<merged.length) {
			arr[j]=merged[i];
			i++;
			j++;
		}
		
	}
}
public class MergeSort 
{
	public static void main(String[] args) 
	{
		int arr[]= {7,4,6,5,9,2,7};
		int n=arr.length;
		Demo.divide(arr, 0, n-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
