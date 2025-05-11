class Super{
    public void g_m(){
        System.out.println("Iam a Grand Parent");
    }
}

class SubSuper extends Super{
    public void p_m() {
        System.out.println("Iam a parent Method");
     }
}

class Sub extends SubSuper{
    public void c_m() {
        System.out.println("Iam a child class");
     }
}
public class MultiLevel {
    public static void main(String[] args){
        Sub c=new Sub();
        c.c_m();
        c.p_m();
        c.g_m();
    }
}
