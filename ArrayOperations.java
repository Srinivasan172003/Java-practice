package arrayOperations;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Creating an array
        int[] arr = {3, 8, 1, 5, 9, 2};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // 2. Traversing the array
        System.out.print("Traversing: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // 3. Searching for an element
        System.out.print("Enter element to search: ");
        int searchKey = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == searchKey) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Element found!" : "Element not found.");
        
        // 4. Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        // 5. Inserting an element
        System.out.print("Enter element to insert: ");
        int newElement = sc.nextInt();
        arr = Arrays.copyOf(arr, arr.length + 1); // Expanding array size
        arr[arr.length - 1] = newElement;
        Arrays.sort(arr);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
        
        // 6. Deleting an element (simple removal)
        System.out.print("Enter index to delete: ");
        int delIndex = sc.nextInt();
        if (delIndex >= 0 && delIndex < arr.length) {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i != delIndex) {
                    newArr[j++] = arr[i];
                }
            }
            arr = newArr;
            System.out.println("Array after deletion: " + Arrays.toString(arr));
        } else {
            System.out.println("Invalid index for deletion.");
        }

        // 7. Updating an element
        System.out.print("Enter index to update: ");
        int updateIndex = sc.nextInt();
        System.out.print("Enter new value: ");
        int updateValue = sc.nextInt();
        if (updateIndex >= 0 && updateIndex < arr.length) {
            arr[updateIndex] = updateValue;
            System.out.println("Array after update: " + Arrays.toString(arr));
        } else {
            System.out.println("Invalid index for update.");
        }

        // 8. Finding min & max
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);
        
        sc.close();
    }
}
