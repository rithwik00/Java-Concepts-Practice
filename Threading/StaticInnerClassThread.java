package Threading;

class StaticInnerClassThread {
    static class MyThread1 extends Thread {
        @Override
        public void run() {
            System.out.println("Keep some task here.....");
        }
    }
 
    //Another thread class as a nested class or Static Inner Class of the usage class
    static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("Keep some task here......");
        }
    }
 
    public static void main(String[] args) {
        //Using the MyThread1 and it's task
 
        MyThread1 thread1 = new MyThread1();
        thread1.start();
 
        //Using MyThread2 and it's task
 
        MyThread2 thread2 = new MyThread2();
        Thread t = new Thread(thread2);
        t.start();
    }    
}