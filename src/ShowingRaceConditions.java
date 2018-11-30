public class ShowingRaceConditions {
    static int counter = 1;

    public static void main(String[] args)
    {
        Runnable r1 = ()->System.out.printf("Counter value: %d%n", getCounterValue());
        Thread t1 = new Thread(r1, "one");
        Thread t2 = new Thread(r1, "two");

        t1.start();
        t2.start();
    }

    //use synchronized to ensure the variables within the method are locked until
    //the method finishes to prevent race conditions
    public synchronized static int getCounterValue()
    {
        return counter++;
    }
}
