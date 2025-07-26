import java.util.Scanner;
import java.util.Arrays;
public class binary_search{
            public static void main(String[] args) {
                int[] arr = {1, 3, 5, 7, 9, 11, 15};
                int target = 7;
                int result = binarySearch(arr, target);
                if (result != -1)
                    System.out.println("Element found at index: " + result);
                else
                    System.out.println("Element not found.");
            }

            public static int binarySearch(int[] arr, int target) {
                int low = 0;
                int high = arr.length - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (arr[mid] == target)
                        return mid;
                    else if (arr[mid] < target)
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
                return -1;
            }
        }


