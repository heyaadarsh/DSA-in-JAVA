package binarySearch;

import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 35, 49, 68, 96, 108};

        int index = binary(arr, 12);

        if(index!=-1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found!");
        }
    }

    static int binary(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e-s) / 2;

            if(target<arr[mid]){
                e = mid - 1;
            }
            else if(target>arr[mid]){
                s = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1; // If element not found
    }
}
