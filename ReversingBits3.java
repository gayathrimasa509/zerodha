import java.util.*;
public class ReversingBits3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt(); 
        System.out.println("Original number: "+n);
        int result = 0;
        while (n > 0) {
            result = (result << 1) | (n & 1);
            n >>= 1;
        }
        System.out.println("Reversed number "+result);
    }
}
