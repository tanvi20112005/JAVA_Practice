import java.io.*;

class binarySearch 
{ 
    public static int binarySearch(int arr[], int n, int target) 
	{ 
        int left = 0; 
        int right = n - 1; 
        
        while(left <= right) 
		{ 
            int mid = left + (right - left) / 2; 
            if(arr[mid] == target) 
			{ 
                return mid; 
            } 
			else if(arr[mid] > target) 
			{ 
                right = mid - 1; 
            } 
			else 
			{ 
                left = mid + 1; 
            } 
        }
        return -1; 
    } 

    public static void main(String args[]) { 
        int arr[] = {2, 3, 4, 5, 10, 40}; 
        int x = 10; 
        int result = binarySearch(arr, arr.length, x); 
        
        if(result == -1) 
            System.out.print("Element is not present in array"); 
        else 
            System.out.print("Element is present at index " + result); 
        
        return; 
    } 
}
