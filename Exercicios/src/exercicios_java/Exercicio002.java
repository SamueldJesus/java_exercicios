package exercicios_java;

import java.util.Scanner;

public class Exercicio002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro valor: ");
		int a = Integer.parseInt(input.next());
		
		System.out.print("Entre com o segundo valor: ");
		int b = Integer.parseInt(input.next());
		
		System.out.print("Entre com o terceiro valor: ");
		int c = Integer.parseInt(input.next());
		
		System.out.print("Entre com o quarto valor: ");
		int d = Integer.parseInt(input.next());
		
		int OPERACAO = a*b - c*d; 
		
		System.out.printf("Diferença: %d", OPERACAO);
		
		input.close();
	}

}
