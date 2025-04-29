// class MyThread extends Thread{
//     public void run(){
//         System.out.println("Thread is running");
//     }
// }
// public class Threads {
//     public static void main(String[] args) {
//         MyThread t1=new MyThread();
//         t1.start(); //start is a thread fun which is inherited
//     }
// }



//chain multiple threads together

// public class Threads {
//     public static void main(String[] args) throws InterruptedException{
//         Thread t1=new Thread(()->{
//             System.out.println("Thread 1 is running...");
//             try{
//                 Thread.sleep(3000);
//             }
//             catch(InterruptedException e){
//             }
//         });
//         Thread t2=new Thread(()->{
//             System.out.println("Thread 2 is running...");
//             // try{
//             //     Thread.sleep(2000);
//             // }
//             // catch(InterruptedException e){
//             // }
//         });
//         t1.start();
//         t1.join(); //continue excuting the thread after completing the 1st thread
//         t2.start();
//     }
// }


//Synchronization 
// class SharedResources{
//     synchronized void print(){
//         for(int i=0;i<5;i++){
//             System.out.println(Thread.currentThread().getName()+"-"+i);
//             try{Thread.sleep(500);}
//             catch(InterruptedException e){}
//         }
//     }
// }
// public class Threads {
//     public static void main(String[] args) {
//         SharedResources resource=new SharedResources();
//         Thread t1=new Thread(resource::print,"Thread 1");
//         Thread t2=new Thread(resource::print,"Thread 2");
//         t1.start();
//         t2.start();
//     }
// }

class Counter{
    int count=0;
    void increment(){
        synchronized(this){
            count++;
        }
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();
        Thread t1=new Thread(()->{for(int i=0;i<5;i++)counter.increment();});
        Thread t2=new Thread(()->{for(int i=0;i<5;i++)counter.increment();});
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count:"+counter.count);
    }
}