package LacosRepeticao;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, quantn=0;
		float media, somanumeros=0;
		
		do {
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				somanumeros += numero;
				quantn++;
			}
			
		} while(numero !=0);
		
		media = somanumeros/quantn;
		
		if (quantn > 0) {
			System.out.println("A média de todos os números múltiplos de 3 é: "+media);
		} else {
			System.out.println("Você não digitou numeros múltiplos de 3");
		}
		

	}

}
