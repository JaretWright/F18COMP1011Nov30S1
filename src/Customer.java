public class Customer {
    private int customerID;
    private String firstName, lastName;
    private static int nextCustomerID=1001;

    //normally you would add all the other attributes of a customer like address, email, phone,
    //etc... but for the sake of time, we will just use first and last name

    public Customer(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        setCustomerID(nextCustomerID++);
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", firstName, lastName);
    }
}
