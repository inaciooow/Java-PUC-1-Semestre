package com.aed.puc.lista1;
import java.util.*;

public class Question2 {
	
	public static void main(String[] args) {
		//Faça um programa para calcular e mostrar a área de um quadrado.
		
		Scanner entrada = new Scanner (System.in);
		int X, resultado;
		
		System.out.print ("Digite o valor do lado do quadrado: ");
		X = entrada.nextInt();
		
		resultado = X * X;
		
		System.out.println("A área do quadrado é : " + resultado);
		
		entrada.close();

	}

}