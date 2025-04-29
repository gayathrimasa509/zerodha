import java.util.*;
public class ImageProcessing11 {
    public static int rgbToGrayscale(int r, int g, int b) {
        return (r * 30 + g * 59 + b * 11) >> 7; 
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r = s.nextInt();//120
        int g = s.nextInt();//200
        int b = s.nextInt();//150
        int grayscale = rgbToGrayscale(r, g, b);
        System.out.println("Grayscale value: " + grayscale);
    }
}
