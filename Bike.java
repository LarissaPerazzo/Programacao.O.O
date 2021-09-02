/*
 * Mat: 0050016465, Larissa Perazzo
 */
//----------------------------------------------------
/*
 *Crie uma classe principal Bike com os atributos:
- marca
- qtdMarchas
- cor
e os métodos:
andar()
frear()

Crie uma classe BikeTester para testar a classe acima 
*/

package intro;

public class Bike {

	public String marca;
	public Integer qtdMarchas;
	public String cor;
	
	
	public void andar() {
		System.out.println("Andar");
	}
	
	public void frear() {
		System.out.println("Freando");
	}
	
}
