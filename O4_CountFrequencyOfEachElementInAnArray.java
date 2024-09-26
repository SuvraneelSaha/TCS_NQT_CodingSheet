import java.util.*;
public class O4_CountFrequencyOfEachElementInAnArray{
  public static void main(String[] args) {
    int arr1[] =  {10,5,10,5,15};
		int n = arr1.length; 
    countFrequency(arr1);
        
    countFrequencyMap(arr1);
    
  }
  public static void countFrequency(int[] arr)
	{
	    boolean visited[] = new boolean[arr.length]; 
	    // why we are doing this boolean array ; 
	    // cause without it the pointing index will present same number over and over again ; 
	    // and will return less count as expected ; 
	    
	   for(int i = 0 ; i < arr.length;i++)
	   {
	       if(visited[i] == true)
	       {
	           continue;
	           // Skip the element as it is  already processed
	       }
	       
	       int count = 1 ; 
	       for(int j = i+1 ; j < arr.length ; j++)
	       {
	           if(arr[i] == arr[j])
	           {
	               visited[j] = true;
	               count ++ ; 
	           }
	       }
	       System.out.println("the count of "+arr[i]+" is "+count);
	       
	   }
	}

  public static void countFrequencyMap(int[] arr)
	{
	    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    
	    for(int i = 0 ; i < arr.length ; i++)
	    {
	        if(map.containsKey(arr[i]) == true)
	        {
	            int value = map.get(arr[i]) ; 
	            value = value + 1 ; 
	            map.put(arr[i] , value);
	        }
	        else
	        {
	            map.put(arr[i] , 1);
	            
	        }
	    }
	    
	    // now Iterating over the HashMap and Printing all the elements ; 
	    
	    for(Map.Entry<Integer,Integer> entry : map.entrySet())
	    {
	        int key = entry.getKey();
	        int value = entry.getValue();
	        System.out.println("Key = "+key+" value = "+value);
	    }
	}



}