
public class AlunoFatecSJC {
	private String nome;
	private String curso;
	private int idade;
	private String semestre;
	
	public AlunoFatecSJC(String nome, String curso, int idade, String semestre){
		this.nome = nome;
		this.curso = curso;
		this.idade = idade;
		this.semestre =semestre;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getSemestre() {
		return semestre;
	}
}
