package com.aed.puc.lista5;

public class Question2 {

	public static void main(String[] args) {
		/*Utilizando a estrutura de repetição FOR, implemente um programa
		em Java que calcule e escreva a seguinte soma:
		soma = (1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50)
		*/
		
		double x=1, y=1, divisao=0, soma=0;
		
		for (double i=1; i<50; i++) {
			x = x +2;
			y = y +1;
			divisao = x / y;
			soma = soma + divisao;
		}
		
		System.out.print("A soma é = "+soma);
		
	}

}