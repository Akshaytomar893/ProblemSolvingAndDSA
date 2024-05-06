package Java.BasicRecursion;

public class ReverseArray {

    int[] revArray(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArray(arr, start + 1, end - 1);
        }
        return arr;
    }

    public static void main(String[] args) {
        ReverseArray ob = new ReverseArray();
        int arr[] = {1,2,3,4,5,6,7};
        int myArr[] = ob.revArray(arr, 0, arr.length-1);

        for(int ele: myArr){
            System.out.print(ele+", ");
        }
    }
}
