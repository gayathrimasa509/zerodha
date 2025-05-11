class Outer{
    private String msg="This is a msg from Outer class";
     void o_m(){
        System.out.println("This is msg from outer method");
    }

    class Inner{
        void i_m(){
            System.out.println("This is a method from inner class");
            System.out.println("Accesing value from inner class "+msg);
        }
    }


}


public class nestedInner {
    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner inn=out.new Inner();
        out.o_m();
        inn.i_m();
        // inn.o_m();

    }
    
}
