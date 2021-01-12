package Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> products = new HashSet<>();
		/*
		 * Hash -> Não tem ordenação na varredura ou impressão. A ordem de saída não é a
		 * mesma de entrada; Aceitam valores do tipo null; Não é sincronizada
		 * (thread-safe); Velocidade no acesso, leitura e modificação de dados;
		 * 
		 * ------------------------------------------------------------------- TreeSet
		 * Treeset -> Os elementos inseridos dentro desse tipo de conjunto devem implementar a
		 * interface Comparable; A ordenação é por elementos únicos; Não suporta objetos
		 * nulos, se caso um elemento ser nulo é lançado a exceção NullPointerException;
		 */
		products.add("Notebook");
		products.add("Televisão");
		products.add("Tablet");

		System.out.println(products.contains("Notebook"));
		products.removeIf(x -> x.charAt(0) == 'T');

		for (String x : products) {
			System.out.println(x);
		}
	}
}
