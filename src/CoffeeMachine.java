import java.util.Scanner;
import java.util.ArrayList;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeData.displayStats();
        do {
            System.out.println("Write action (buy, fill, take, exit): ");
            String action = scanner.next();
            switch(action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String choice = scanner.next();
                    if(choice.equals("back")) {
                        System.out.println();
                        break;
                    }
                    else {
                        if(CoffeeData.check(choice))
                            CoffeeData.buy(choice);
                        System.out.println();
                        break;
                    }

                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int w = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int m = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int cb = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int c = scanner.nextInt();
                    CoffeeData.fill(w, m, cb, c);
                    System.out.println();
                    break;
                case "take":
                    CoffeeData.take();
                    System.out.println();
                    break;
                case "remaining":
                    CoffeeData.displayStats();
                    break;
                case "exit":
                    System.exit(0);
            }
        } while( true );
    }
}