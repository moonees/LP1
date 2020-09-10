
public class InstrumentoMusical {
	private String nome;
	private String marca;
	private String cor;
	
	public InstrumentoMusical(String nome, String marca, String cor) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void  setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void tocar() {
		System.out.println("Comece a tocar");
	}
}
