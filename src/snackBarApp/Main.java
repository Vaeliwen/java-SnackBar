package snackBarApp;

public class Main {

    public static void workWithData() {

        //Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        //Machines
        VendingMachine foodMachine = new VendingMachine("Food");
        VendingMachine drinkMachine = new VendingMachine("Drink");
        VendingMachine offMachine = new VendingMachine("Office");

        //Foods
        Snack food1 = new Snack("Chips", 36, 1.75, foodMachine.getName() );
        Snack food2 = new Snack("Chocolate Bar", 36, 1.00, foodMachine.getName() );
        Snack food3 = new Snack("Pretzel", 30, 2.00, foodMachine.getName() );
        //Drinks
        Snack drink1 = new Snack("Soda", 24, 2.50, drinkMachine.getName() );
        Snack drink2 = new Snack("Water", 20, 2.75, drinkMachine.getName() );

        //Queries
        System.out.println("*** PROCESSES ***");
        System.out.println(jane.getName() + " buys three sodas, bringing her balance down to $" + jane.buyItem(drink1.totalCost(3)) + " and bringing available soda to " + drink1.buySnack(3) + ".");
        System.out.println(jane.getName() + " buys a pretzel, bringing her balance down to $" + jane.buyItem(food3.totalCost(1)) + " and bringing available pretzels to " + food3.buySnack(1) + ".");
        System.out.println(bob.getName() + " buys two sodas, bringing his balance down to $" + bob.buyItem(drink1.totalCost(2)) + " and bringing available soda to " + drink1.buySnack(2) + ".");
        System.out.println(jane.getName() + " finds ten dollars, bringing her balance up to $" + jane.addCash(10.00) + "!");
        System.out.println(jane.getName() + " buys a chocolate bar, bringing her balance down to $" + jane.buyItem(food2.totalCost(1)) + " and bringing available chocolate bars down to " + food2.buySnack(1) + ".");
        System.out.println("The pretzels are restocked, bringing the total pretzels to " + food3.addQuantity(12) + ".");
        System.out.println(bob.getName() + " buys three pretzels, bringing his balance down to $" + bob.buyItem(food3.totalCost(3)) + " and bringing the available pretzels down to " + food3.buySnack(3) + ".");
    }

    public static void main(String[] args) {
        workWithData();
    }
}