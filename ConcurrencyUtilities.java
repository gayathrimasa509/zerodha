//Executor Service

// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;
// public class ConcurrencyUtilities {
//     public static void main(String[] args) {
//         ExecutorService executor=Executors.newFixedThreadPool(3);
//         Runnable task =()->{
//             System.out.println(Thread.currentThread().getName()+" is executing ");
//         };
//         for(int i=0;i<5;i++){
//             executor.submit(task);// executor to execute my thread 5 times
//         }
//         executor.shutdown();//it is used to stop the execution of threads which are running
//     }
// }


//Callable is similar to runnable(capable of executing threads) but it can throw exceptions and a return value

// // import java.util.concurrent.Callable;
// // import java.util.concurrent.ExecutionException;
// // import java.util.concurrent.ExecutorService;
// // import java.util.concurrent.Executors;
// // import java.util.concurrent.Future;
// //instead of all above import statements we use the below import statement
// import java.util.concurrent.*;
// public class ConcurrencyUtilities {
//     public static void main(String[] args) throws ExecutionException,InterruptedException{
//         ExecutorService executor=Executors.newSingleThreadExecutor();
//         Callable<Integer> task=()->{
//             Thread.sleep(2000);
//             return 10*10;
//         };
//         Future<Integer> future=executor.submit(task);
//         //Future interface provides methods to get result of a task from Callable
//         System.out.println("Doing the task");
//         Integer res=future.get();
//         System.out.println("Result: "+res);
//         Thread.sleep(2000);
//         System.out.println("Task");
//         executor.shutdown();
//     }
// }


//CountDownLatch

import java.util.concurrent.*;
public class ConcurrencyUtilities {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch=new CountDownLatch(3);
        Runnable worker=()->{
            System.out.println(Thread.currentThread().getName()+" Work Started");
            try{
                Thread.sleep(2000);
                latch.countDown();//decrease the count
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        };
        for(int i=0;i<3;i++){
            new Thread(worker).start();
        }
        latch.wait();//the count becomes 0
        System.out.println("all threads are completed");
    }
}