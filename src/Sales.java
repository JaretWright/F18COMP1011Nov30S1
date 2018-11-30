import java.util.ArrayList;
import java.util.HashMap;

public class Sales {
    HashMap<Customer, ArrayList<Order>> sales;

    public Sales()
    {
        sales = new HashMap<>();
    }

    /**
     * This puts a new customer into the sales HashMap.  If the
     * customer is already there, it should NOT over write the order
     * if
     * @param customer
     */
    public void addCustomer(Customer customer)
    {
        if (!sales.containsKey(customer))
            sales.put(customer, new ArrayList<Order>());
    }

    /**
     * Add an order to a customer
     */
    public void addOrder(Customer customer, Order order)
    {
        if (!sales.containsKey(customer))
            addCustomer(customer);

        sales.get(customer).add(order);
    }



}
