package ExCollections04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ExCollections04.comparator.NomeComparator;

public class ExecutaCarro {
	public static void main(String[] args) {
		System.out.println("ORDEM CRESCENTE DE POTÊNCIA");
		List<CarrosCrescente> listaCarro = new ArrayList<CarrosCrescente>();

		CarrosCrescente carro1 = new CarrosCrescente();
		carro1.setNome("Palio");
		carro1.setCavalos(120);
		carro1.setPreco(20.000f);

		CarrosCrescente carro2 = new CarrosCrescente();
		carro2.setNome("Celta");
		carro2.setCavalos(100);
		carro2.setPreco(15.000f);

		CarrosCrescente carro3 = new CarrosCrescente();
		carro3.setNome("Ferrari");
		carro3.setCavalos(300);
		carro3.setPreco(80.000f);

		listaCarro.add(carro1);
		listaCarro.add(carro2);
		listaCarro.add(carro3);

		Collections.sort(listaCarro);

		for (CarrosCrescente carros : listaCarro) {
			System.out.println(carros);
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("ORDEM DECRESCENTE DE POTÊNCIA");
		List<CarrosDecrescente> listaCarros = new ArrayList<CarrosDecrescente>();

		CarrosDecrescente carro4 = new CarrosDecrescente();
		carro4.setNome("Meriva");
		carro4.setCavalos(150);
		carro4.setPreco(30.000f);

		CarrosDecrescente carro5 = new CarrosDecrescente();
		carro5.setNome("Voyage");
		carro5.setCavalos(105);
		carro5.setPreco(25.000f);

		CarrosDecrescente carro6 = new CarrosDecrescente();
		carro6.setNome("Fusca");
		carro6.setCavalos(95);
		carro6.setPreco(5.000f);

		listaCarros.add(carro4);
		listaCarros.add(carro5);
		listaCarros.add(carro6);

		Collections.sort(listaCarros);

		for (CarrosDecrescente carros : listaCarros) {
			System.out.println(carros);
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("ORDEM ALFABÉTICA");
		Comparator<CarrosCrescente> comparadorNome = new NomeComparator();
		Comparator<CarrosCrescente> comparadorPreco = new PrecoComparator();

		Collections.sort(listaCarro, comparadorNome);

		for (CarrosCrescente carros : listaCarro) {
			System.out.println(carros);

		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("ORDEM DECRESCENTE DE PREÇO.");
		Collections.sort(listaCarro, comparadorPreco);

		for (CarrosCrescente carros : listaCarro) {
			System.out.println(carros);

		}
	}
}
