
public class ReverseArray {

 
    static int reverseArray(int arr[], int left, int right) {
        if (left >= right) {
            return left;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        return reverseArray(arr, left+1,right-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int rev = reverseArray(arr, 0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
