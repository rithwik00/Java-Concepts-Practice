package Threading;

class UserThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("This is a user thread.....");
    }
}
 
class DaemonThread extends Thread {
    public DaemonThread() {
        setDaemon(true);
    }
 
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++)
            System.out.println("This is daemon thread....."+i);  
    }
}

class UserDeamonThread {
    public static void main(String[] args) {
        DaemonThread daemon = new DaemonThread();   //Creating the DaemonThread
 
        daemon.start();                 //Starting the daemon thread
 
        UserThread1 userThread1 = new UserThread1();   //Creating the UserThread1
 
        userThread1.start();          //Starting the user thread
    }
}
