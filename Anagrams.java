import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        String x = "Vivek";
        String y = "keivj";
        
        x = x.toLowerCase();
        y = y.toLowerCase();
        System.out.println(x);
        
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        System.out.println(a);
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        Boolean result = Arrays.equals(a,b);
        
        if (result == true) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}