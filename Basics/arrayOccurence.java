import java.util.*;

class arrayOccurence {

    static ArrayList<Integer> find(int[] arr, int x) {
        int n = arr.length;

        int first = lowerBound(arr, x);

        int last = upperBound(arr, x) - 1;

        if (first == n || arr[first] != x) {
            first = -1;
            last = -1;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }

    static int lowerBound(int[] arr, int x) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= x)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    static int upperBound(int[] arr, int x) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > x)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int x = 5;
        ArrayList<Integer> res = find(arr, x);
        System.out.println(res.get(0) + " " + res.get(1));
    }
}