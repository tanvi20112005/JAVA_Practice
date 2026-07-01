import java.util.Arrays;

class countOnesEx {
    public static int countOnes(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) { 
            int mid = (low + high) / 2;

            if (arr[mid] == 0)
                high = mid - 1;

            else if (mid == n - 1 || arr[mid + 1] != 1)
                return mid + 1;
                  
            else
                low = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0, 0, 0 };
        System.out.println(countOnes(arr));
    }
}