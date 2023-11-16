package OperadoresJava;

import java.util.Scanner;
import java.util.Locale;

public class DiferencaDeProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, resultado;
		String numeroString;
		
		System.out.print("Primeiro valor: ");
		n1 = ler.nextFloat();
		System.out.print("Segundo valor: ");
		n2 = ler.nextFloat();
		System.out.print("Terceiro valor: ");
		n3 = ler.nextFloat();
		System.out.print("Quarto valor: ");
		n4 = ler.nextFloat();
		
		resultado = (n1 * n2) - (n3 * n4);
		
		System.out.printf("Resultado: %.2f", resultado);

	}

}
