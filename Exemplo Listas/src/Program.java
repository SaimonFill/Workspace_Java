import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * declara e instancia a lista com tipo e classe ArrayList
		 */
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		/*
		 * Inserir um elemento na posição 2, depois do "Alex" 
		 */
		list.add(2,  "Marco");
		
		
		/*
		 * Tamanho da lista
		 */
		System.out.println(list.size());
			
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
				
		/*
		 * Remover um elemento
		 */
		// list.remove(1);
				
		/*
		 * Remover todos que começam com um predicado
		 */
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------");
		
		/*
		 * Encontrar a posição de um elemento
		 */
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco")); // não encontra o elemento
		
		System.out.println("-----------------------");
		
		/*
		 * Deixar na lista somente quem tem o nome começado com um predicado
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		/*
		 * Encontrar um elemento que atenda um certo predicado
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
