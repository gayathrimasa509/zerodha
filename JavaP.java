import myPackage.MyClass;
public class JavaP {
    public static void main(String args[]) {  
      
       // Initializing the String variable 
       // with a value 
        
       String s = "GeeksforGeeks";
       
       // Creating an instance of class MyClass in 
       // the package.
       MyClass o = new MyClass();
       System.out.println(o.x);
       System.out.println(o.y); 
       o.getName(s);
    }
 }
