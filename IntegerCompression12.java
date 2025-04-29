import java.util.*;
public class IntegerCompression12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int encoded = n>>1;
        int decoded = encoded<<1;

        System.out.println("Original Number: " + n);
        System.out.println("Encoded Number: " + encoded);
        System.out.println("Decoded Number: " + decoded);
    }
}

