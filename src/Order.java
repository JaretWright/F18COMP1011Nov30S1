import java.time.LocalDate;

public class Order {
    private int orderID;
    private static int nextOrderID=100001;

    private int unitsOrdered;
    private LocalDate datePurchased;
    private double price;
    private String description;

    /**
     *
     * @param description what the product is
     * @param unitsOrdered how many were purchased
     * @param price price in CAD
     */
    public Order(String description, int unitsOrdered, double price) {
        setUnitsOrdered(unitsOrdered);
        setPrice(price);
        setDescription(description);
        setDatePurchased(LocalDate.now());
        setOrderID(nextOrderID++);
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUnitsOrdered() {
        return unitsOrdered;
    }

    public void setUnitsOrdered(int unitsOrdered) {
        this.unitsOrdered = unitsOrdered;
    }

    public LocalDate getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
