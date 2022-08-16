package program;

/*
beecrowd | 1174 - Seleçao em Vetor I

Faça um programa que leia um vetor A[100]. No final, mostre todas as posições
do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

Entrada
A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.

Saída
Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição
do vetor e x é o valor armazenado na posição, com uma casa após o ponto decimal.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] vet = new double[100];
		
		for(int i = 0; i < 100; i++) vet[i] = sc.nextDouble();
		
		for(int i = 0; i < 100; i++) if(vet[i] <= 10) System.out.printf("A[%d] = %.1f\n",i, vet[i]);
			
		sc.close();
	}
}