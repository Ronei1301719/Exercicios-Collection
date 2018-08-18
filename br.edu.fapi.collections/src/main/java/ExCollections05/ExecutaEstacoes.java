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
			estacao.setEstacao(preferencia.toLowerCase());

			List<Estacao> lista = estacoes.get(estacao.getEstacao());
			lista.add(estacao);

		}

		Comparator<Estacao> comparadorNome = new NomeComparator();

		Collections.sort(estacoes.get("verao"), new NomeComparator());
		Collections.sort(estacoes.get("inverno"), new NomeComparator());
		Collections.sort(estacoes.get("outono"), new NomeComparator());
		Collections.sort(estacoes.get("primavera"), new NomeComparator());

		for (Entry<String, List<Estacao>> entry : estacoes.entrySet()) {
			System.out.println("");
			System.out.println("");
			System.out.println("Listando pessoas que gostam de: " + entry.getKey());
			for (Estacao estacao1 : entry.getValue()) {
				System.out.println("Nome: " + estacao1.getNome());
			}

			System.out.println("A quantidade de pessoas que gostam dessa estação é:");
			System.out.println(entry.getValue().size());

			List<Estacao> mostrarTodos = listaTotal(estacoes);
			System.out.println("");
			System.out.println("");
			System.out.println("A quantidade de pessoas que responderam a pesquisa é:");
			System.out.println(mostrarTodos.size());

			for (Estacao estacao : mostrarTodos) {
				System.out.println(estacao.getNome());
			}
		}

	}

	public static List<Estacao> listaTotal(Map<String, List<Estacao>> mapaDeEstacoes) {
		List<Estacao> listaTodos = new ArrayList<Estacao>();
		listaTodos.addAll(mapaDeEstacoes.get("verao"));
		listaTodos.addAll(mapaDeEstacoes.get("inverno"));
		listaTodos.addAll(mapaDeEstacoes.get("outono"));
		listaTodos.addAll(mapaDeEstacoes.get("primavera"));
		Collections.sort(listaTodos, new NomeComparator());
		return listaTodos;
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
