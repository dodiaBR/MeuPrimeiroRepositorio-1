package aula17.labs;
import java.util.Scanner;

public class Aula17Ex18 {
		
		public static void main (String[]args) {
			
			Scanner ler = new Scanner(System.in);
			int n = ler.nextInt();
			double div;
			double resto;
			int cont=1;
			int primo=0;
			double somaR=0;
			for (div=1;div<n;div++) {
				resto = n%div;
				somaR = somaR + resto;
				System.out.println();
				System.out.println(somaR);
				
				// TUDO ERRADO ahhhhhhhhhhhhhhhh
				
			
			}
				
			
			
		}
}


/*
18. Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.*/