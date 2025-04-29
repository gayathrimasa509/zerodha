import java.util.*;
public class DiscountCalculator13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double price = s.nextDouble();
        double discount = s.nextDouble();
        double finalPrice =  price - ((price * discount) / 100);
        System.out.println("Original Price: $" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + finalPrice);
    }
}
