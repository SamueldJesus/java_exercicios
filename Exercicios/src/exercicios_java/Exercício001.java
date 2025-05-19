package exercicios_java;

import java.util.Scanner;

public class Exercício001 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = Integer.parseInt(input.nextLine());
		System.out.print("Digite o primeiro número: ");
		int numero2 = Integer.parseInt(input.nextLine());
		
		int soma = numero1 + numero2;
		
		System.out.printf("%d + %d = %d", numero1, numero2, soma);
		
		input.close();	
	}

}
