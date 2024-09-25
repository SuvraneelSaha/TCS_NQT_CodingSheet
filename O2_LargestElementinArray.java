import java.util.*;

public class O2_LargestElementinArray
{
	public static void main(String[] args) {
		int arr1[] =  {2,5,1,3,9};
        System.out.println("The largest element in array is: " + Sort(arr1));
        
        System.out.println("The largest element in array is via Approach 2 is : " + Sort1(arr1));
		
	}
	public static int Sort(int[] arr)
	{
	    Arrays.sort(arr);
	    return arr[(arr.length)-1];
	    
	}
	
	public static int Sort1(int[] arr)
	{
	    int max = arr[0];
	    
	    for (int i = 0 ;i<arr.length ;i++ )
	    {
	        if(arr[i] > max)
	        {
	            max = arr[i];
	        }
	    }
	    return max ; 
	    
	}
}