class Fibanacci {
    
    public static void main(String args[]) {
        int a = 0, b = 1;
        System.out.println(a+" "+b);
        int c;
        for (int i = 1; i < 10; i++) {
            c = a + b;
            System.out.println(" "+c);
            a = b;
            b = c;
        }
    }
}

class Fibanacci {
    
    public static void main(String args[]) {
       int n = 6;
       System.out.println(fibanacci(n));
    }
    
    private static long fibanacci(int n) {
        if (n < 2) {
            return n;
        }
        return (fibanacci(n - 1) + fibanacci(n - 2));
    }
}