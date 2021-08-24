package Threading;

class MainThread {
    public static void main(String[] args)
    {
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName()); 
        
        t.setName("main-thread-name-modified");
 
        System.out.println(t.getName());    //Output : main-thread-name-modified
    }
}
