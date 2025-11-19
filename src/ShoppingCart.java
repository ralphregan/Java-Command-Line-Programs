import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String item;
    int quantity;
    double price;
    char currency;
    double total;

        System.out.println("What item would you like to buy?");
        item = scanner.nextLine();
        System.out.println("What is the price for each?");
        price = scanner.nextFloat();
        System.out.println("How many would you like?");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println(total);
    scanner.close();
    }



}
