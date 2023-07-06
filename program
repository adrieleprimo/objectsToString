package application;
import java.util.Locale;
import java.util.Scanner;

import entities.products;
public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		products Products = new  products();
		System.out.println("Enter product data:");
		System.out.print("Name:");
		Products.name = sc.next();
		System.out.print("Price: ");
		Products.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		Products.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + Products);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		Products.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + Products);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		Products.removeProducts(remove);
		System.out.println();
		System.out.println("Updated data: " + Products);
		
		
		sc.close();
	}


}
