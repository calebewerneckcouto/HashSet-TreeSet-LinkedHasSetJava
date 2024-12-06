package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		
		/*IMPORTANTE
		 * 
		 * HashSet -  mais rapido (operacoes 0(1) em tabela hash) e nao ordenado.
		 * 
		 * TreeSet - mais lento (operacoes 0(log(n)) em arvore rubro-negra e ordenado pelo compareTo do objeto (ou Comparator)
		 * 
		 * LinkedHashSet - velocidade intermediaria e elementos na ordem em que sao adicionados.
		 * 
		 * 
		 * 
		 * 
		 * */
		
		Set<Product> set = new TreeSet<>();
		
		
		set.add(new Product("TV",900.00));
		set.add(new Product("Notebook",1200.00));
		set.add(new Product("Tablet",400.00));
		
		for (Product p : set) {
			System.out.println(p);
		}

	}

}
