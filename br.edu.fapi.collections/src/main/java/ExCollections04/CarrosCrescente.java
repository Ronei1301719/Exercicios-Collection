package ExCollections04;

public class CarrosCrescente implements Comparable<CarrosCrescente> {
	
	private String nome;
	private float preco;
	private int cavalos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	
	@Override
	public String toString() {
		return "Carros [nome=" + nome + ", preco=" + preco + ", cavalos=" + cavalos + "]";
	}
	public int compareTo(CarrosCrescente compare) {
		if (this.cavalos < compare.cavalos ) {
			return -1; 
		}else if (this.cavalos > compare.cavalos) {
			return +1;
		}
		
		return 0;
	}
	
	
}
