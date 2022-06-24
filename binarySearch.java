class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,23,45,67};
        int value = 45;
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearch(arr, value)); 
    }
    int binarySearch(int arr[], int value) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        
        while (start <= end && arr[mid] != value) {
            if (value < arr[mid]) {
                end = mid - 1;
            } else { 
                start = mid + 1;
        }
        mid = start + (end - start) / 2;
    }
    if (value == arr[mid]) {
        return mid;
    }
    return -1;
}
}