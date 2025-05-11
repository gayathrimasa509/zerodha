class NonStatic{
    private static String msg="Outer class";
    static void o_m(){
        System.out.println("Method in outer class");
    }

    static class StaticInner{
        static void display(){
            System.out.println("Method in inner class");
            System.out.println("Accesing value "+msg);
            o_m();
        }
    }
}
public class StaticInner {
    public static void main(String[] args) {
        //NonStatic out=new NonStatic();
        NonStatic.StaticInner.display();
    }
}
