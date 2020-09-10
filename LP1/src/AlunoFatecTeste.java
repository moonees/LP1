
public class AlunoFatecTeste {
	public static void main(String [] args) {
		AlunoFatecSJC[] aluno = new AlunoFatecSJC[5];
		aluno[0] = new AlunoFatecSJC("Bento","engenharia",19,"primeiro");
		aluno[1] = new AlunoFatecSJC("Chico", "Quimica", 22,"quarto");
		aluno[2] = new AlunoFatecSJC("Monica", "Fisica",20,"terceiro");
		aluno[3] = new AlunoFatecSJC("Cascão","Matematica",21,"setimo");
		aluno[4] = new AlunoFatecSJC("Magali","Gastronomia",23,"oitavo");
		
		for(int i=0;i <5;i++){
			System.out.println(aluno[i].getNome()+ "\t" +"cursando" + "\t"+ aluno[i].getCurso()+ "\t" + aluno[i].getSemestre());
		}
	}
}
