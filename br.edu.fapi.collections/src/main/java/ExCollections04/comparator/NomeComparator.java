package ExCollections04.comparator;

import java.util.Comparator;

import ExCollections04.CarrosCrescente;

public class NomeComparator implements Comparator<CarrosCrescente> {

	public int compare(CarrosCrescente carro1, CarrosCrescente carro2) {
		return carro1.getNome().compareTo(carro2.getNome());
				}
	

}
