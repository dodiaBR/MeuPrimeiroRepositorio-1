package aula19.labs;

import java.util.Scanner;
public class Aula19Ex16a {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.print("Insira o valor da posicao "+i+": ");
			vetorA[i] = scan.nextInt();
		}
		
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int igual15 = 0;
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] == 15) {
				igual15++;
			}else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			}else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Qtd de nº == 15: "+igual15);
		System.out.println("Soma dos nº < 15: "+somaMenor15);
		System.out.println("Média dos nº > 15: "+(somaMaior15/qtdMaior15)); 
	}

}
/*
Criar um vetor A com 10 elementos inteiros. Escrever um programa
que calcule e escreva: a) a soma de elementos armazenados neste
vetor que são inferiores a 15; b) a quantidade de elementos
armazenados no vetor que são iguais a 15; e c) a média dos
elementos armazenados no vetor que são superiores a 15.
*/