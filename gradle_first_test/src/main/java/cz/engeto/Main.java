package cz.engeto;
// Java code for linearly searching x in arr[]. If x
// is present then return its location, otherwise
// return -1

public class Main {
    public static int search(int arr[], int x) {
        if (arr == null) {
            return -1;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }

        return -1;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;

        // Function call
        int result = search(arr, x);
        if (result == -1) {
            System.out.print("Element is not present in array");
        } else {
            System.out.print("Element is present at index " + result);
        }
    }
}
