package LacosRepeticao;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, categoria, pBack=0, mFront=0, hMobile40=0, mFullStack30=0;
		String segue = "s";
		
		
		while(segue.equalsIgnoreCase("s")) {
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		System.out.println("\n1- Masculino\n2- Feminino\n3- Outros");
		System.out.println("Digite o sexo: ");
		sexo = leia.nextInt();
		
		System.out.println("\n1- Backend\n2- Frontend\n3- Mobile\n4- FullStack");
		System.out.println("Digite a categoria: ");
		categoria = leia.nextInt();
		
		
		if( categoria == 1) {
			pBack++;
		} else if (sexo == 2 && categoria == 2) {
			mFront++;
		} else if (idade > 40 && sexo == 1 && categoria == 3) {
			hMobile40++;
		} else if (idade < 30 && sexo == 2 && categoria == 4) {
			mFullStack30++;
		}
			
		System.out.println("\nDeseja continuar a leitura de dados de um novo colaborador ou não? (S/N): ");
		segue = leia.next();
		
	}
	
		System.out.println("Total de pessoas desenvolvedoras Backend é: " +pBack);
		System.out.println("Total de mulheres desenvolvedoras Frontend é: "+mFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos é: "+hMobile40);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos é: "+mFullStack30);
		
   }
		
		
}



