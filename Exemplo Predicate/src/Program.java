import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import entities.Product;

public class Program {
	public static int globalValue = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		}
	}
}