package exercicios_java;

import java.util.Scanner;

public class Exercicio003 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Entre com o número do funcionário: ");
		int id = Integer.parseInt(entrada.nextLine().replace(",", "."));
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = Integer.parseInt(entrada.nextLine().replace(",","."));
		
		System.out.print("Salário por hora: ");
		double horaSalario = Double.parseDouble(entrada.nextLine().replace(",","."));
		
		
		double salario = horaSalario * horasTrabalhadas;
		System.out.printf("Id: %d %nSalário: $%.2f", id, salario);
		
		entrada.close();
	}

}
