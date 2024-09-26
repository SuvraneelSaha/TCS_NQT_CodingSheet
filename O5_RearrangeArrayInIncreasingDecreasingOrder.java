import java.util.*;
public class O5_RearrangeArrayInIncreasingDecreasingOrder{
public static void main(String[] args) {
  int arr[] = {8,7,1,6,5,9};
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int[] arr1 = new int[n/2];
        
        for(int i = 0 ; i < n/2 ; i++)
        {
            arr1[i] = arr[i];
        }
        
        int[] arr2 = new int[n/2];
        
        for(int i = n-1,j=0; i >= n/2 ; i--)
        {
            arr2[j] = arr[i];
            j++;
        }
        
    
        
        
        
        System.out.println(Arrays.toString(arr1));
        
         System.out.println(Arrays.toString(arr2));
        

         // basically the first half should be in Sorted Order ; 
         // and the 2nd portion must be in the Reverse Order ; 
         
}
}