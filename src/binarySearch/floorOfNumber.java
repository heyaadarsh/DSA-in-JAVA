package binarySearch;

public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr = {12, 23, 35, 49, 68, 96, 108};

        int floor = floorNum(arr, 110);
        System.out.println(arr[floor]);
    }

    static int floorNum(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid]>target){
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else return mid;
        }

        return end;
    }
}
