import java.util.*;
public class powerOfTwo4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(n > 0 && (n & (n - 1)) == 0);

    }
}
