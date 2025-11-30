package EMPRESA;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int valorCorreto = 10000;
		int palpite;
		String msg;
		
		int idade = 10;
		
		if (idade > 5 && idade <15)
		
		System.out.println("Digite seu palpite: ");
		palpite = teclado.nextInt();
		
		
		
		while(palpite != valorCorreto) {
			
			msg = palpite>valorCorreto?"Um pouco mais...":"Um pouco menos...";
			System.out.println(msg);
			/*if(palpite > valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais...");
			}
			System.out.println("Digite seu palpite: ");
			palpite = teclado.nextInt();*/
			
		}
		
		System.out.println("Acertou miseravél!");
		
		

	}

}
