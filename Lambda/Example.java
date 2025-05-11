interface myInterface{
    void show();
}

class Example{
    public static void main(String[] args) {
        myInterface ob=() -> System.out.println("Hello world");
        ob.show();

    }
}