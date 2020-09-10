
public class Profissão {
	private String nome;
	private String profissao;
	private double salario;
	
	public Profissão(String nome, String profissao, double salario) {
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
	}
	public void  setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void trabalhar() {
		System.out.println("Sua função é muito importante para a sociedade");
	}
}
