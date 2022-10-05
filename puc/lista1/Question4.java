package com.aed.puc.lista1;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		//Faça um programa para calcular e mostrar a área de um cubo.
		
		Scanner entrada = new Scanner (System.in);
		int X, resultado;
		
		System.out.print ("Digite o valor do lado do cubo: ");
		X = entrada.nextInt();
		 
		resultado = X * X * X;
		
		System.out.println("A área do cubo é : " + resultado);
		
		entrada.close();
		
	}

}