class HelloWorld {
    public static void main(String[] args) {
       int arr[] = {1,1,2,3,4,4,5};
       int i = 0;
       int result[] = new int[arr.length];
       
       for (int j = 0; j < arr.length - 1; j++) {
           if (arr[j] != arr[j+1]) {
               result[i] = arr[j];
               i++;
           }
       }
       result[i++] = arr[arr.length-1];
       for (int k = 0; k < i; k++) {
           System.out.print(result[k]+" ");
       }
       System.out.println();
    }
}