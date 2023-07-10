package application;
import java.util.Locale;
import java.util.Scanner;

import entities.products;
public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		products Products = new products(name, price);
		Products.setName("Computer");
		Products.setPrice(1000.00);
		System.out.println("Updated name: " + Products.getName());
		System.out.println("Updated price: " + Products.getPrice());
		System.out.println();
		System.out.println("Product data: " + Products);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity= sc.nextInt();
		Products.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Products);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		Products.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Products);
		
		
		sc.close();
	}


}
