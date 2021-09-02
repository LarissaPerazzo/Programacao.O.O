package intro;

public class BikeTester {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		b.marca = "Caloi";
		b.qtdMarchas = 2;
		b.cor = "Preta";
		
		b.andar();
		b.frear();
	}

}
