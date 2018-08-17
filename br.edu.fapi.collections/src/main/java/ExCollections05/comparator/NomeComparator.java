package ExCollections05.comparator;

import java.util.Comparator;

import ExCollections05.Estacao;

public class NomeComparator implements Comparator<Estacao> {
	public int compare(Estacao nome, Estacao nome2) {
		return nome.getNome().compareTo(nome2.getNome());
	}
}
