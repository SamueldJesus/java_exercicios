package exercicios_java;

import java.util.Scanner;

public class Exercicio004 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int produto_id, produto_id2;
	int produto_quantidade, produto_quantidade2;
	double produto_valor, produto_valor2;
	
	System.out.print("Id do produto: ");
	produto_id = Integer.parseInt(entrada.nextLine());
	
	System.out.print("Quantidade de produtos: ");
	produto_quantidade = Integer.parseInt(entrada.nextLine());
	
	System.out.print("Valor do produto: ");
	produto_valor = Double.parseDouble(entrada.nextLine().replace(",", "."));
	
	System.out.print("Id do produto: ");
	produto_id2 = Integer.parseInt(entrada.nextLine());
	
	System.out.print("Quantidade de produtos: ");
	produto_quantidade2 = Integer.parseInt(entrada.nextLine());
	
	System.out.print("Valor do produto: ");
	produto_valor2 = Double.parseDouble(entrada.nextLine().replace(",", "."));
	
	double valorFinal = (produto_valor * produto_quantidade) + (produto_valor2 * produto_quantidade2);
	
	System.out.printf("Valor total a pagar: %.2f", valorFinal);
	
	entrada.close();
	}
}
