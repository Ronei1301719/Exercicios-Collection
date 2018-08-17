package ExCollections05.comparator;

import java.util.Comparator;

import ExCollections05.Estacao;

public class EstacaoComparator implements Comparator<Estacao> {

	public int compare(Estacao estacao1, Estacao estacao2) {
		return estacao1.getEstacao().compareTo(estacao2.getEstacao());
	}

}
