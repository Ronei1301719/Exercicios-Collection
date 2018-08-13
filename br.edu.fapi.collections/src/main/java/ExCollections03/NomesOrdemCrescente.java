package ExCollections03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NomesOrdemCrescente {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Ronei");
		lista.add("Matheus");
		lista.add("Zé");
		lista.add("Wellington");
		
		
		
		Collections.sort(lista);
		 
		for (String nomes : lista) {
			System.out.println(nomes);
		}
	}
}
