package com.aed.puc.lista3;
import java.util.*;

public class Question8 {

	public static void main(String[] args) {
		/*Faça um programa para calcular e mostrar a soma da série abaixo:
		S = (1 + 1/2 + 1/3 + 1/4 + .............1/10)
		*/
		
		Scanner entrada = new Scanner (System.in);
		double i, soma;
		i=1;
		soma=0;
		
		while (i<=10) {
			System.out.print(1+"/"+i + " + ");
			soma = soma + (1/i);
			i = i + 1;
		}
		
		System.out.println("\nSoma = " + soma);
		
		entrada.close();

	}

}