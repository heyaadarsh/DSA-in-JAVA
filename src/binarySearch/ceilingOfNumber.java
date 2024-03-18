package binarySearch;

import java.util.*;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {12, 23, 35, 49, 68, 96, 108};

        int ceil = ceilingNum(arr, 101);
        System.out.println(arr[ceil]);
    }

    static int ceilingNum(int[] arr, int n){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;

//            //Method: 1
//            int mid = s + (e-s)/2;
//            if(arr[mid]==n){
//                return n;
//            }
//            else if(arr[mid]<n){
//                if(arr[mid+1]>n){
//                    return arr[mid+1];
//                }
//                s = mid + 1;
//            }
//            else if(arr[mid]>n){
//                if(arr[mid-1]<n){
//                    return arr[mid];
//                }
//                e = mid - 1;
//            }

            // Method: 2
            if(n<arr[mid]){
                e = mid - 1;
            }
            else if(n>arr[mid]){
                s = mid + 1;
            }
            else{
                return mid;
            }

        }

        return s;
    }
}
