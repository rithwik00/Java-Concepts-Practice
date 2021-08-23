package Threading;

class MyThread implements Runnable {
    @Override
    public void run() {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 1000; i++)
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
    }
}
 
public class RunnableThread {
    //Main Thread
    public static void main(String[] args) {
        MyThread myThread = new MyThread();    //instantiating your thread class that implements Runnable interface
 
        Thread t = new Thread(myThread);       //Creating an object to Thread class by passing your thread as an argument
 
        t.start();                            //Starting the thread
    }
}
