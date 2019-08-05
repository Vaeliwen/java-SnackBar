package snackBarApp;

public class Snack {

    //Fields
    private static int maxId = 0;
    private int id;
    private int vendingId;
    private String name;
    private int quantity;
    private double cost;

    //Constructor
    public Snack(String name, int quantity, double cost, int vendingId) {
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

        public int getVendingId() {
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

        public void setVendingId(int vendingId) {
            this.vendingId = vendingId;
        }

        //Other Methods
        public void addQuantity(int added) {
            quantity = quantity + added;
        }

        public void buySnack(int bought) {
            quantity = quantity - bought;
        }

        public double totalCost(int bought) {
            double totalCost = cost * bought;
            
            return totalCost;
        }
        
}