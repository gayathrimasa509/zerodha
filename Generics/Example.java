class Add<T extends Number>{
    T a;
    T b;
    Add(T a,T b){
        this.a=a;
        this.b=b;
    }

    double add(){
        return a.doubleValue() + b.doubleValue();
    }
}
class Example{
    public static void main(String[] args) {
        Add<Integer> ob=new Add<>(5, 10);
        System.out.println(ob.add());
    }
}