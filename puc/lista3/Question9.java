package com.aed.puc.lista3;

public class Question9 {

	public static void main(String[] args) {
		/*Faça um programa para calcular e mostrar a soma da série abaixo:
		S = (1 + 3 +5 + 7 +.................. + 49)
		*/
		
		int j, soma;
		j=1;
		soma=0;
		
		while (j<=49) {
			System.out.print(j+" + ");
			soma = soma + j;
			j = j + 2;
		}
		
		System.out.println("\nSoma = "+soma);
	}

}