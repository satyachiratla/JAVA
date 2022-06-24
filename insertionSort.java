import java.util.*;

class HelloWorld {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,2,7,1,3,0};
        
        for (int i = 1; i < arr.length; i++) {
            int currentVal = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > currentVal) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentVal;
        }
        printArray(arr);
    }
}