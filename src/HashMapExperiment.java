public class HashMapExperiment {
    public static void main(String[] args)
    {
        Customer customer1 = new Customer("Anita","Job");
        Customer customer2 = new Customer("Adam","Bomb");
        Customer customer3 = new Customer("Goggles","Pazzano");

        Sales sales= new Sales();
        sales.addCustomer(customer1);
        sales.addCustomer(customer2);
        sales.addCustomer(customer3);

        sales.addOrder(customer1, new Order("Smash Brothers",4,79.99));
        sales.addOrder(customer1, new Order("Honda Civic",1,17998.99));
        sales.addOrder(customer1, new Order("thoughtless gift of cash",1,500000));
        sales.addOrder(customer1, new Order("Lear Jet",1,1000790.99));
        sales.addOrder(customer2, new Order("Nintendo Switch",2,400.13));
        sales.addOrder(customer2, new Order("New T-Shirt",10,10.99));
        sales.addOrder(customer3, new Order("Puppy",1,457.99));
        sales.addOrder(customer3, new Order("Gym Pass",1,1000.34));

        //display in a loop all the customers sales info
        for (Customer customer: sales.getCustomers())
            System.out.printf("%s spent $%.2f%n", customer, sales.getAmountSpent(customer));

        //show the top customer
        System.out.printf("Our top customer is %s spending %.2f",sales.getTopCustomer(),
                                    sales.getAmountSpent(sales.getTopCustomer()));

        //show the total sales
    }
}
