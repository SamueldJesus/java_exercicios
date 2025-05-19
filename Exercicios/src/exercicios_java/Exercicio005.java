package exercicios_java;

import java.util.Scanner;

public class Exercicio005 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com um horário com número inteiro: ");
		int x = Integer.parseInt(entrada.nextLine());
		
		if (x < 12) {
			System.out.println("Bom dia!");
		}
		else if (x <= 18) {
			System.out.println("Boa tarde!");
		}
		else if (x <= 23) {
			System.out.println("Boa noite!");
		}
		else {
			System.out.printf("[Error]: não existe o horário: %d", x);
		}
		
		entrada.close();
	}
}
