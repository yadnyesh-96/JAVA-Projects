package ShoppingDiscount;

import java.util.Scanner;

public class ShoppingDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1[] = new Product[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter the Product name:");
            String name = sc.nextLine().trim();

            // Validate empty name
            while (name.isEmpty()) {
                System.out.println("Product name cannot be empty. Enter the Product name:");
                name = sc.nextLine().trim();
            }

            System.out.println("Enter Product price :");
            double price;
            while (true) {
                if (sc.hasNextDouble()) {
                    price = sc.nextDouble();
                    sc.nextLine(); // consume newline after number
                    if (price >= 0) break;
                    else System.out.println("Price must be non-negative. Enter again:");
                } else {
                    System.out.println("Invalid input. Enter a numeric price:");
                    sc.nextLine();
                }
            }

            System.out.println("Select category: 1.Electronics  2.Clothing  3.Groceries");
            int item;
            while (true) {
                if (sc.hasNextInt()) {
                    item = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (item >= 1 && item <= 3) break;
                    else System.out.println("Please enter 1, 2 or 3:");
                } else {
                    System.out.println("Invalid input. Enter 1, 2 or 3:");
                    sc.nextLine();
                }
            }

            if (item == 1) {
                p1[i] = new Electronics(name, price);
            } else if (item == 2) {
                System.out.println("Enter sale type for clothing (e.g., seasonalSale or regular):");
                String saleType = sc.nextLine().trim();
                // default to regular if user enters nothing
                if (saleType.isEmpty()) saleType  "regular";
                p1[i] = new Clothing(name, price, saleType);
            } else { // item == 3
                p1[i] = new Groceries(name, price);
            }
        }

        // Print bill
        System.out.println("\n--- BILL DETAILS ---");
        double totalOriginal = 0.0;
        double totalFinal = 0.0;
        for (int i = 0; i < p1.length; i++) {
            Product prod = p1[i];
            double original = prod.product_price;
            double finalPrice = prod.getFinalPrice();
            totalOriginal += original;
            totalFinal += finalPrice;
            System.out.printf("%d. %-20s | Original: Rs.%.2f | After Discount: Rs.%.2f%n",
                    i + 1, prod.product_name, original, finalPrice);
        }

        System.out.println("---------------------------");
        System.out.printf("Total (Original) : Rs.%.2f%n", totalOriginal);
        System.out.printf("Total (After Discount) : Rs.%.2f%n", totalFinal);
        System.out.printf("Total Savings : Rs.%.2f%n", (totalOriginal - totalFinal));

        sc.close();
    }
}
