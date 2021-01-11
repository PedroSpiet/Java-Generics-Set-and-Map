package HashCodeAndEquals;

import HashCodeEqualsService.Pessoa;

public class HashCodeEqualsExample {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", "Pedro@email.com");
		Pessoa p2 = new Pessoa("Maria", "Maria@gmail.com");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));

	}

}
