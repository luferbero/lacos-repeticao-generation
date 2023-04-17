package LacosRepeticao;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, contPar=0, contImpar=0, x;
		

		for(x=1; x<=10; x++) {
			System.out.println("\nDigite o "+x+"º número: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			
		}
		
		
		System.out.println("\nTotal de números Pares: "+contPar);
		System.out.println("\nTotal de números Ímparares: "+contImpar);
		
	}

}
