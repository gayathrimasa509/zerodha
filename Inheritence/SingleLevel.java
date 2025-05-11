class Parent{
    public void p_m(){
        System.out.println("Iam a parent Method");
    }
}

class Child extends Parent{
    public void c_m(){
        System.out.println("Iam a child class");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        Child c=new Child();
        c.c_m();
        c.p_m();
    }
}