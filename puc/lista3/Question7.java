package com.aed.puc.lista3;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		/*Faça um programa para calcular e mostrar a soma da série abaixo:
		S = (1 + 2 +3 + 4 +.................. + 50)
		*/
		
		Scanner entrada = new Scanner (System.in);
		int i, soma;
		i=1;
		soma=0;
		
		while (i<=50) {
			System.out.print(i+" + ");
			soma = soma + i;
			i = i + 1;
		}
		
		System.out.print("\nSoma = " + soma);
		
		entrada.close();

	}

}