public class Program{
    public static void main(String[] args){
        System.out.println("Hello world - from main method");

        System.out.println(main("AITS"));
        
    }

    public static String main(String name){

        return "Hello " + name;
    }
}