import java.util.Scanner;

public class Multiplication15 {
    public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	   /*  for(int i=1;i<=10;i++)
	    {
	       System.out.printf("%d * %d = %d \n", n, i, n* i);

	    }*/

        /*int i=1;
        while(i<=10)
	    {
	       System.out.printf("%d * %d = %d \n", n, i, n* i);
            i++;
	    }*/

        int i=1;
        do{
            System.out.printf("%d * %d = %d \n", n, i, n* i);
            i++;
        }while(i<=10);
	}
}
