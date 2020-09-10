
public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[5];
		pessoa[0] = new Pessoa("Carla","Feminino",35,60);
		pessoa[1] = new Pessoa("Bruno", "Masculino",12,56);
		pessoa[2] = new Pessoa("Ramirez","Masculino",44,102.4);
		pessoa[3] = new Pessoa("Carmem", "Feminino", 43, 65);
		pessoa[4] = new Pessoa("Gabriela", "Feminino",19,55.5);
		
		for(int i=0; i<5; i++) {
			System.out.println(pessoa[i].getNome() + "\t" + "do sexo"+ "\t" + pessoa[i].getSexo() +"\t " + "pesando" + "\t"+ pessoa[i].getPeso() +"kg");
		}
		pessoa[0].ideal();
	}
}
