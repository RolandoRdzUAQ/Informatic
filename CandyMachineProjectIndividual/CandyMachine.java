import java.util.*;

public class CandyMachine {
    
    static Scanner console = new Scanner(System.in);

    public static void showSelection() {
        System.out.println("*** Welcome to Shelly's Candy Shop ***");
        System.out.println("To select an item, enter ");
        System.out.println("1 for Candy");
        System.out.println("2 for Chips");
        System.out.println("3 for Gum");
        System.out.println("4 for Cookies");
        System.out.println("9 to exit");
    }
    public static void sellProduct(Dispenser product, CashRegister cRegister) {
        int price;
        int coinsInserted;
        int coinsRequired;

        if (product.getCount() > 0) {
            price = product.getProductCost();
            coinsRequired = price;
            coinsInserted = 0;

            while (coinsRequired > 0) {
                System.out.print("Please deposit " + coinsRequired + " cents: ");
                coinsInserted = coinsInserted + console.nextInt(); 
                coinsRequired = price - coinsInserted;
            }

            System.out.println();
            cRegister.acceptAmount(coinsInserted);
            product.makeSale();
            System.out.println("Collect your item at the bottom and enjoy.\n");
        } else {
            System.out.println("Sorry this item is sold out.\n");
        }
    }
}
