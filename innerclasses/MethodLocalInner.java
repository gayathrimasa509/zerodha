class Out{
    private String msg="Outer class";

    void o_m(){
        System.out.println("Inside outer class method");
        class Inn{
            void i_m(){
                System.out.println("Method in inner class");
                System.out.println("Accesing value :"+msg);
            }
        }

        Inn i=new Inn();
        i.i_m();
    }
}
public class MethodLocalInner {
    public static void main(String[] args) {
        Out o=new Out();
        o.o_m();
    }
}
