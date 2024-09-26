import java.util.*;

public class O3_SecondLargestAndSecondSmallest{
  public static void main(String[] args) {
    int arr1[] =  {2,5,1,3,9};
		int n = arr1.length;
        System.out.println("The second largest element in array is: " + findSecondLargest(arr1,n));
        
        System.out.println("The second smallest element in array is : " + findSecondSmallest(arr1,n));
  }
  public static int findSecondSmallest(int[] arr,int n)
    {
        if(n < 2)
        {
            return -1;
        }
        int smallest =Integer.MAX_VALUE;
        int SecondSmallest  = Integer.MAX_VALUE ; 

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < smallest)
            {
                SecondSmallest = smallest;
                smallest = arr[i];
                
            }
            else if(arr[i] < SecondSmallest && arr[i] != smallest)
            {
                SecondSmallest = arr[i];
            }
        }
        return SecondSmallest ; 
    }

    public static int findSecondLargest(int[] arr,int n)
    {
        if(n < 2)
        {
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE ; 

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;
                largest = arr[i];
                
            }
            else if(arr[i] > secondLargest && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    } 
    

}