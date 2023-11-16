package OperadoresJava;
import java.util.Scanner;

public class MediaParticipante {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Insira a primeira nota: ");
		nota1 = ler.nextFloat();
		System.out.print("Insira a segunda nota: ");
		nota2 = ler.nextFloat();
		System.out.print("Insira a terceira nota: ");
		nota3 = ler.nextFloat();
		System.out.print("Insira a quarta nota: ");
		nota4 = ler.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média: " + String.format("%.02f", media));
		
	}
}
