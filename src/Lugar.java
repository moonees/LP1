
public class Lugar {
	private String nome;
	private String pa�s;
	
	
	public Lugar(String nome, String pa�s) {
		this.nome = nome;
		this.pa�s = pa�s;
		
	}
	public void setNome(String nome) {
		this.nome = nome;	
	}
	public String getNome() {
		return nome;
	}
	public  void setPa�s(String pa�s) {
		this.pa�s = pa�s;
	}
	public String getPa�s() {
		return pa�s;
	}
	public void lugar() {
		System.out.println("Este cidade � muito  bonita");
	}
}
