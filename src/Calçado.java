
public class Calçado {
	private String marca;
	private int tamanho;
	private String cor;
	
	
	public Calçado(String marca, int tamanho, String cor) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
    public void andar() {
    	System.out.println("Comece a andar");
    }
    public void correr() {
    	System.out.println("Comece a correr");
    }
}
	

