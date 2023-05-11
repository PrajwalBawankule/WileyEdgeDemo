package Searching;

public class BinarySearch {

	public static int binarysearch(int a[],int l,int r,int key)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			if(a[mid]==key)
				return mid;
			else if(key<a[mid])
			{
				return binarysearch(a,l,mid,key);
			}
			else
				return binarysearch(a,mid+1,r,key);
			
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,5,7,11,13,14,16,22};
		int key=11;
		int index=binarysearch(a,0,a.length-1,key);
		if(index!=-1)
			System.out.print("Element found at "+index);
		else
			System.out.print("Element not found");

	}

}
