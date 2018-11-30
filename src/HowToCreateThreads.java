public class HowToCreateThreads {

    public static void main(String[] args)
    {
        //create a Thread using Runnable
        new Thread(new HelloRunnable()).start();
        System.out.println("Hello from "+Thread.currentThread().getName());

        //using an anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from "+Thread.currentThread().getName()+
                        " a thread created by implementing an anonymous class");
            }
        };

        Runnable r2 = ()-> System.out.println("Hello from "+Thread.currentThread().getName()+
                " a thread created by implementing an anonymous class using Lambda");


        Thread t1 = new Thread(r1, "Friday afternoon Thread");
        t1.start();


        Thread t2 = new Thread(r1);
        t2.start();

        for (int i=1; i<=10; i++)
            System.out.printf("%4d: %s%n", i, Thread.currentThread().getName());


    }
}
