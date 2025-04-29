import java.util.*;
public class TypePromotion2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        float b=s.nextFloat();
        double c=s.nextDouble();
        char d='A';
        
        int res=(int)((b*a)+(c/d));

        System.out.println("Expressions in Mixed data types : "+res);
    }
    
}
