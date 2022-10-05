package com.aed.puc.lista5;

public class Question3 {

	public static void main(String[] args) {
		/*A conversão de graus Farenheit para Centígrados é obtida por  C = 5/9 ( F - 32 ) .
		Utilizando a estrutura de repetição FOR, implemente um programa
		em Java que calcule e escreva uma tabela de graus Centígrados
		em função de graus Farenheit, que variam de 50 a 100, de 5 em 5.
		*/
		
		int centigrados;
		
		for (int f=50; f<=100; f=f+5) {
			centigrados = (f-32) * 5/9;
			System.out.print("\n"+centigrados +" Graus Centígrados em função de "+f +" Farenheit");
		}

	}

}