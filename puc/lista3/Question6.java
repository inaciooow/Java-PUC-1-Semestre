package com.aed.puc.lista3;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		/*Utilizando uma estrutura de repetição, implemente um programa em
        Java para ler uma sequência de 8 números inteiros positivos e verificar
        se cada um deles é par ou ímpar, escrevendo mensagem adequada.
        Ao término indique quantos números pares e quantos ímpares foram digitados.
        */
		
		Scanner entrada = new Scanner (System.in);
		int n, i, cp, ci;
		i=0;
		cp=0;
		ci=0;
		
		while (i<8) {
			i = i +1;
			System.out.println("Digite um número: ");
			n = entrada.nextInt();
			
			if (n % 2 == 0) {
				System.out.println("Número par");
				cp = cp +1;
			} else {
				System.out.println("Número ímpar");
				ci = ci +1; 
				} 
		 }
		
		System.out.println("Total de pares: " +cp);
		System.out.println("Total de ímpares: " +ci);
		
		entrada.close();

	}

}