public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from "+Thread.currentThread().getName()+
                " a thread created by implementing a runnable interface");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Yawn - back from sleep in thread:"+Thread.currentThread().getName());
    }
}
