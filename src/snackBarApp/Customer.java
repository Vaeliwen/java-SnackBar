package snackBarApp;

public class Customer {

    //Fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //Constructor
    public Customer(String name, double cashOnHand) {
        maxId++;

        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //Methods
        
        //Getters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double cashOnHand() {
            return cashOnHand;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }

        //Other Methods
        public void addCash(double added) {
            cashOnHand = cashOnHand + added;
        }

        public void buyItem(double total) {
            cashOnHand = cashOnHand - total;
        }

}