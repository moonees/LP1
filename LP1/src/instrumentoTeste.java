
public class InstrumentoTeste {
	public static void main(String [] args) {
<<<<<<< HEAD
		InstrumentoMusical[] instrumento = new InstrumentoMusical[5];
		instrumento[0] = new InstrumentoMusical("Viol�o","Vintage","Marrom");
		instrumento[1] = new InstrumentoMusical("Guitarra", "Boss", "Branca");
		instrumento[2] = new InstrumentoMusical("Saxofone", "Boss", "Dourado");
		instrumento[3] = new InstrumentoMusical("Bateria", "Laney", "Preta e Branco");
		instrumento[4] = new InstrumentoMusical("Triangulo", "Vintage", "Prata");
=======
		instrumentoMusical[] instrumento = new instrumentoMusical[5];
		instrumento[0] = new instrumentoMusical("Violão","Vintage","Marrom");
		instrumento[1] = new instrumentoMusical("Guitarra", "Tama", "Branca");
		instrumento[2] = new instrumentoMusical("Saxofone", "Boss", "Dourado");
		instrumento[3] = new instrumentoMusical("Bateria", "Vintage", "Preta e Branco");
		instrumento[4] = new instrumentoMusical("Triangulo", "Laney", "Prata");
>>>>>>> fe352751c4c5af22a64f03519866ed1ffd48f08b
		
		for(int i=0; i <5; i++) {
			System.out.println("O instrumento é"+"\t" + instrumento[i].getNome() +"\t" + "de cor" + "\t" + instrumento[i].getCor());
			
		}
		instrumento[0].tocar();
	}
}
