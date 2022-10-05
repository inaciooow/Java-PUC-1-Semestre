package com.aed.puc.lista4;

public class Question2 {

	public static void main(String[] args) {
		/*Faça um programa para somar e mostrar a soma abaixo:
		S = (-7, -5, -3, .....................) a soma dos 10 primeiros;
		*/
		
		int i, soma;
		soma=0;
		i=-7;
		
		while(i<=11) {
			soma = soma + i;
			System.out.print(i+" + ");
			i = i + 2;
		}
		
		System.out.print("\nA soma é: "+soma);

	}

}