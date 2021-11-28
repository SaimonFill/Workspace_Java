package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\tProduct #" + i + " data:");
			System.out.print("\tCommon, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("\tName: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("\tPrice: ");
			double productPrice = sc.nextDouble();
			
			if(type == 'c') {
				list.add(new Product(productName, productPrice));
			}
			if(type == 'u') {
				System.out.print("\tManufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(productName, productPrice, date));
			}
			if(type == 'i') {
				System.out.print("\tCustoms fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(productName, productPrice, customFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}

		sc.close();
	}

}
