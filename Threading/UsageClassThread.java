package Threading;

class UsageClass extends Thread {
    @Override
    public void run() {
        System.out.println("Keep some task here.....");
    }

    public static void main(String[] args) {
        //Using thread and it's task
        UsageClass t = new UsageClass();
        t.start();
    }
}
//Another Usage Class
class AnotherUsageClass {
    void method() {
        //Using the thread and it's task
        UsageClass t = new UsageClass();
        t.start();
    }
}