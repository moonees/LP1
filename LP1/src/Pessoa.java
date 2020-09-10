
public class Pessoa {
	private String nome;
	private String sexo;
	private int idade;
	private double peso;
	
	
	public Pessoa(String nome, String sexo, int idade, double peso){
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.peso = peso;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;	
	}
	public String getSexo() {
		return sexo;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return peso;
	}
	public void ideal() {
		System.out.println("Você está no peso ideal");
	}
}
