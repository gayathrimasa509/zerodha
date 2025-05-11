class Gen<T>{
    T arr[];
    Gen(T arr[]){
        this.arr=arr;
    }

    void display(){
        for(T a:arr){
            System.out.print(a+" ");
        }
    }
}

public class Example2 {
   public static void main(String[] args) {
     Integer[] arr={1,2,3,4,5};
     Gen<Integer> ob=new Gen<Integer>(arr);
     ob.display();

   } 
}
