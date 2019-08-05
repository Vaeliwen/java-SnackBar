package snackBarApp;

public class Snack {

    //Fields
    private static int maxId = 0;
    private int id;
    private String vendingId;
    private String name;
    private int quantity;
    private double cost;

    //Constructor
    public Snack(String name, int quantity, double cost, String vendingId) {
        maxId++;

        id = maxId;

        this.vendingId = vendingId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }

    //Methods

        //Getters
        public int getId() {
            return id;
        }

        public String getVendingId() {
            return vendingId;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public double getCost() {
            return cost;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public void setVendingId(String vendingId) {
            this.vendingId = vendingId;
        }

        //Other Methods
        public int addQuantity(int added) {
            quantity = quantity + added;

            return quantity;
        }

        public int buySnack(int bought) {
            quantity = quantity - bought;

            return quantity;
        }

        public double totalCost(int bought) {
            double totalCost = cost * bought;
            
            return totalCost;
        }
        
}