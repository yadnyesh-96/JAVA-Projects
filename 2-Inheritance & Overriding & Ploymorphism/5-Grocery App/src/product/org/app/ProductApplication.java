package product.org.app;

import java.util.*;

public class ProductApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[5];

		System.out.println("Enter Product details below:");
		for (int i = 0; i < p.length; i++) {
			p[i] = new Product();
			p[i].setProID((i + 1));
			System.out.println("Product no."+(i+1));
			System.out.println("Product Name:");
			String nm = sc.nextLine();
			p[i].setProName(nm);

			System.out.println("Quantities:");
			int qt = sc.nextInt();
			p[i].setQuantity(qt);

			System.out.println("Rate of Product:");
			double rate = sc.nextInt();
			p[i].setRate(rate);
			
			sc.nextLine();
		}

		Bill b = new Bill(p);
		b.DisplayBill();

	}

}
