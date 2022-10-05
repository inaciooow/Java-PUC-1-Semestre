package com.aed.puc.lista4;

public class Question1 {

	public static void main(String[] args) {
		/*Faça um programa para somar e mostrar o resultado da soma abaixo:
		S = (2 + 4 +6 + 8 +..................) a soma dos 15 primeiros;
		*/
		
		int i, soma;
		soma=0;
		i=2;
		
		while(i<=30) {
			soma = soma + i;
			System.out.print(i+" + ");
			i = i + 2;
		}
		
		System.out.print("\nA soma é: "+soma);

	}

}