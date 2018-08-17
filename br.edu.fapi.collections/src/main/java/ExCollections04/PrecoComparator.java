package ExCollections04;

import java.util.Comparator;

import ExCollections04.CarrosCrescente;

public class PrecoComparator implements Comparator<CarrosCrescente>{

	public int compare(CarrosCrescente carro1, CarrosCrescente carro2) {
		if(carro1.getPreco() < carro2.getPreco()) {
			return +1;
		} else if (carro1.getPreco() > carro2.getPreco()) {
			return -1;
		}
		return 0;
		
	}
	
	

}
