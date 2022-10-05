package com.aed.puc.lista2;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		/*Faça um programa para ler 3 números diferentes quaisquer e
		após mostre o valor do maior e o valor do menor entre os três.
		*/
		
		Scanner entrada = new Scanner (System.in);
		int a, b, c;
		
		System.out.print("Digite o primeiro número: ");
		a = entrada.nextInt();
		
		System.out.print("Digite o segundo número: ");
		b = entrada.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		c = entrada.nextInt();
		
		if((a>b)&&(a>c))
			System.out.printf("O maior é: %d" , a);
		
		if((b>a)&&(b>c))
			System.out.printf("O maior é: %d" , b);
		
		if((c>a)&&(c>b))
			System.out.printf("O maior é: %d" , c);

		if((a<b)&&(a<c))
			System.out.printf("\nO menor é: %d" , a);
		
		if((b<a)&&(b<c))
			System.out.printf("\nO menor é: %d" , b);
		
		if((c<a)&&(c<b))
			System.out.printf("\nO menor é: %d" , c);
		
		entrada.close();
		
	}

}