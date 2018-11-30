import java.util.LinkedList;

public class Experiment {
    public static void main(String[] args)
    {
        LinkedList<Float> linkedList = new LinkedList<>();
        linkedList.add(new Float(10.2));
        linkedList.add(new Float(0.2));
        linkedList.add(new Float(8.2));
        linkedList.add(new Float(11));
        linkedList.add(new Float(14.3));

        System.out.printf("%f", linkedList.stream()
                                    .max((a,b)-> a.compareTo(b))
                                    .get());

    }
}
