/** 
 * Matrícula: 0050016465 - Larissa Perazzo
 */

package intro;

import java.io.IOException;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) throws IOException {
		
		int entrada;
		
		Scanner tab = new Scanner(System.in);
		System.out.println("Valor: ");
		entrada = tab.nextInt();
		
		int multiplicador = 0;
		while(multiplicador <= 10) {
			int resultado = entrada * multiplicador;
			System.out.println(resultado);
			multiplicador++;
		}
	}

}
