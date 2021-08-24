package Threading;

class AnonymousThread {
    public static void main(String[] args) {
        //Thread as an anonymous inner class
        new Thread() {
            @Override
            public void run() {
                System.out.println("Keep some task here.....");
            }
        }.start();
 
        //Thread as an anonymous inner class
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Keep some task here.....");
            }
        }).start();
    }    
}
