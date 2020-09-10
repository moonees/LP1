
public class instrumentoTeste {
	public static void main(String [] args) {
		instrumentoMusical[] instrumento = new instrumentoMusical[5];
		instrumento[0] = new instrumentoMusical("Violão","Batata","Marrom");
		instrumento[1] = new instrumentoMusical("Guitarra", "Batata", "Branca");
		instrumento[2] = new instrumentoMusical("Saxofone", "Batata", "Dourado");
		instrumento[3] = new instrumentoMusical("Bateria", "Batata", "Preta e Branco");
		instrumento[4] = new instrumentoMusical("Triangulo", "Batata", "Prata");
		
		for(int i=0; i <5; i++) {
			System.out.println("O instrumento é"+"\t" + instrumento[i].getNome() +"\t" + "de cor" + "\t" + instrumento[i].getCor());
			
		}
		instrumento[0].tocar();
	}
}
