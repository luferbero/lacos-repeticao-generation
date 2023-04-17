package LacosRepeticao;

import java.util.Scanner;

public class DoWhileEx1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n, somap=0;
		
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			if(n >0) {
				somap+=n;
			}
			
		} while(n != 0);

		System.out.println("\nA soma dos números positivos é: "+somap);
		
	}

}
