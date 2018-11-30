import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class WarmUp {
    public static void main(String[] args) {
//        TreeMap<String, Double> gifts = new TreeMap<>(Comparator.reverseOrder());
        TreeMap<String, Double> gifts = new TreeMap<>((a,b)-> b.compareToIgnoreCase(a));

        gifts.put("A Giant", 10003.32);
        gifts.put("Super SMash stuff olympics...it's really good for a Switch", 79.99);
        gifts.put("A car that will not do a hissy fit", 56334.99);

        System.out.println("All I want is....");
        for(String giftName:gifts.keySet())
            System.out.printf("%s for the small amount of $%.2f%n", giftName, gifts.get(giftName));
//
//        for (Map.Entry<String, Double> entry:gifts.entrySet())
//            System.out.printf("%s for the small amount of $%.2f", entry.getKey(), entry.getValue());


    }
}
