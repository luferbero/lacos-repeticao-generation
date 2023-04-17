package LacosRepeticao;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite outro número: ");
		n2 = leia.nextInt();
		
		if(n1 > n2) {
			System.out.println("Intervalo inválido");
		}else {
		
		for(n1 = n1; n1 <= n2; n1++) {
			if(n1 % 3 == 0 && n1 % 5 == 0) {
				System.out.println(n1 + " é múltiplo de 3 e 5");
				leia.close();
			} else {
				
			}
			
		}
		}

	    
	}

}
