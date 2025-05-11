interface myInterface{
    int add(int a,int b);
}
public class Addition {
    public static void main(String[] args) {
        myInterface ob=(int a,int b) -> {
            return a+b;
        };

        System.out.println(ob.add(5,6));

    }
}
