/*
 * Mat: 0050016465, Larissa Perazzo 
*/

/*
 * Faça um programa em Java para ler
 * um vetor de 10 números e re-imprimir
 * os números na ordem crescente.
 */

package intro;

import java.util.Scanner;
import java.util.Arrays;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Entre com o valor " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
		
		for(int n : num) {
			System.out.println(n);
		}
		
		System.out.println();
		
		Arrays.sort(num);
		
		System.out.println("Ordem crescente: ");
		for(int j = 0; j < num.length; j++) {
			System.out.print(num[j] + " ");
		}
		
		sc.close();
		
	}

}
