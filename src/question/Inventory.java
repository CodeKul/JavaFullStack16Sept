package question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private final Integer itemNumber;
    private final String itemName;
    private final Integer price;
    private Integer stock;

    public Inventory(Integer itemNumber, String itemName, Integer price, Integer stock) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
    }

    public static void main(String[] args) {
        Inventory p1 = new Inventory(101, "Milk", 42, 10);
        Inventory p2 = new Inventory(102, "Cheese", 50, 20);
        Inventory p3 = new Inventory(103, "Ghee", 500, 15);
        Inventory p4 = new Inventory(104, "Bread", 40, 16);

        List<Inventory> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Scanner scanner = new Scanner(System.in);
        Integer buyItemNumber;
        Integer buyQuantity;
        System.out.println("Enter item number  and buyQuantity");
        buyItemNumber = scanner.nextInt();
        buyQuantity = scanner.nextInt();
        for (Inventory inventory : list) {
            if (buyItemNumber.equals(inventory.itemNumber)) {
                if (inventory.stock > buyQuantity) {
                    inventory.stock = inventory.stock - buyQuantity;
                } else {
                    System.out.println("Stock is not available");
                }
            }
            System.out.println(inventory.stock);
        }

    }
}
