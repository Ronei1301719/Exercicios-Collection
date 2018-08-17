package ExCollections05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import ExCollections05.comparator.NomeComparator;

public class ExecutaEstacoes {
	public static <T> void main(String[] args) {
		String nome = "";
		String preferencia = "";

		Map<String, List<Estacao>> estacoes = executaPrograma();

		Scanner scanner = new Scanner(System.in);

		while (!nome.equalsIgnoreCase("fim")) {
			Estacao estacao = new Estacao();
			System.out.println("Por favor, digite seu nome:");
			nome = scanner.nextLine();
			estacao.setNome(nome);
			if (nome.equalsIgnoreCase("fim")) {
				break;
			}

			System.out.println("Agora digite sua estação preferida:");
			preferencia = scanner.nextLine();
			estacao.setEstacao(preferencia);

			List<Estacao> lista = estacoes.get(estacao.getEstacao());
			lista.add(estacao);

		}

		Comparator<Estacao> comparadorNome = new NomeComparator();

		Collections.sort(list, new  comparadorNome);

		for (Entry<String, List<Estacao>> entry : estacoes.entrySet()) {
			System.out.println("Listando pessoas que gostam de: " + entry.getKey());
			for (Estacao estacao1 : entry.getValue()) {
				System.out.println("Nome: " + estacao1.getNome());
			}

		}

	}

	public static Map<String, List<Estacao>> executaPrograma() {
		Map<String, List<Estacao>> estruturaDeDados = new HashMap<String, List<Estacao>>();
		estruturaDeDados.put("verao", new ArrayList<Estacao>());
		estruturaDeDados.put("outono", new ArrayList<Estacao>());
		estruturaDeDados.put("inverno", new ArrayList<Estacao>());
		estruturaDeDados.put("primavera", new ArrayList<Estacao>());

		return estruturaDeDados;

	}

}
