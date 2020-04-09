import java.util.Scanner;
import java.util.ArrayList;
public class CoffeeData {
    static int water = 1200, milk = 540, coffeeBeans = 120, cups = 9, money = 550;

    static void displayStats() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposabe cups");
        System.out.println(money + " of money");
    }

    static boolean check(String choice) {
        ArrayList<String> inadequateResources = new ArrayList<String>();
        switch(choice) {
            case "1":
                if(water >= 250 && coffeeBeans >= 16 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    return true;
                }
                else {
                    if(water < 250)
                        inadequateResources.add("water");
                    if(coffeeBeans < 16)
                        inadequateResources.add("coffee beans");
                    if(cups < 1)
                        inadequateResources.add("disposable cups");
                    System.out.print("Sorry, not enough ");
                    for(int i=0; i<inadequateResources.size(); i++) {
                        System.out.print(inadequateResources.get(i));
                        if(i == inadequateResources.size() - 1)
                            System.out.print("!");
                        else
                            System.out.print(", ");
                    }
                    inadequateResources.clear();
                    return false;
                }
            case "2":
                if(water >= 350 && milk >= 75 && coffeeBeans >= 20 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    return true;
                }
                else {
                    if(water < 350)
                        inadequateResources.add("water");
                    if(milk < 75)
                        inadequateResources.add("milk");
                    if(coffeeBeans < 20)
                        inadequateResources.add("coffee beans");
                    if(cups < 1)
                        inadequateResources.add("disposable cups");
                    System.out.print("Sorry, not enough ");
                    for(int i=0; i<inadequateResources.size(); i++) {
                        System.out.print(inadequateResources.get(i));
                        if(i == inadequateResources.size() - 1)
                            System.out.print("!");
                        else
                            System.out.print(", ");
                    }
                    inadequateResources.clear();
                    return false;
                }
            case "3":
                if(water >= 200 && milk >= 100 && coffeeBeans >= 12 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    return true;
                }
                else {
                    if(water < 200)
                        inadequateResources.add("water");
                    if(milk < 100)
                        inadequateResources.add("milk");
                    if(coffeeBeans < 12)
                        inadequateResources.add("coffee beans");
                    if(cups < 1)
                        inadequateResources.add("disposable cups");
                    System.out.print("Sorry, not enough ");
                    for(int i=0; i<inadequateResources.size(); i++) {
                        System.out.print(inadequateResources.get(i));
                        if(i == inadequateResources.size() - 1)
                            System.out.print("!");
                        else
                            System.out.print(", ");
                    }
                    inadequateResources.clear();
                    return false;
                }
        }
        return false;
    }
    static void buy(String choice) {
        switch(choice) {
            case "1":
                water -= 250;
                coffeeBeans -= 16;
                money += 4;
                cups -= 1;
                break;
            case "2":
                water -= 350;
                milk -= 75;
                coffeeBeans -= 20;
                money += 7;
                cups -= 1;
                break;
            case "3":
                water -= 200;
                milk -= 100;
                coffeeBeans -= 12;
                money += 6;
                cups -= 1;
                break;
            case "back":
        }
    }

    static void fill(int w, int m, int cb, int c) {
        water += w;
        milk += m;
        cups += c;
        coffeeBeans += cb;
    }

    static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}