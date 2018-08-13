package ExCollections02;

import java.util.ArrayList;
import java.util.List;

public class ListaNomesExercicio02 {
	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();

		lista.add("Ronei");
		lista.add("Mateus");
		lista.add("Gustavo");
		lista.add("Bruno");
		lista.add("Jonas");

		/* 
		 * for (int i = 0; i <lista.size(); i ++) {
		 *  
		 * System.out.println(lista.get(i));
		 * 
		 * }
		 */

		for (String nomes : lista) {
			System.out.println(nomes);
		}

	}
}
