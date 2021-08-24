package Threading;

class UserThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++)
            System.out.println("This is an user thread....");
    
    }
}

class DeamonThread {
    public static void main(String[] args) {
        UserThread userThread = new UserThread();   //Creating the UserThread
 
        System.out.println(userThread.isDaemon());    //Output : false
 
        userThread.setDaemon(true);         //changing the thread as Daemon
 
        userThread.start();                 //Starting the thread
 
        System.out.println(userThread.isDaemon());      //Output : true
    }
}
