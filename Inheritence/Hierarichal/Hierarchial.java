package Hierarichal;



class Mother{
    public void m_m(){
        System.out.println("Iam a Mother");
    }
}

class Child1 extends Mother{
    public void c1_m(){
        System.out.println("Iam child 1");
    }
}
 class Child2 extends Mother{
    public void c2_m(){
        System.out.println("Iam child 2");
    }
 }


public class Hierarchial {
    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        c1.m_m();
        c2.m_m();
    }
}
