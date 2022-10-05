package com.aed.puc.lista1;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		//Faça um programa para calcular e mostrar a área de triangulo retângulo.
		
		Scanner entrada = new Scanner (System.in);
		int X, Y, resultado;
		
		System.out.print ("Digite o valor da base: ");
		X = entrada.nextInt();
		 
		System.out.print ("Digite o valor da altura: ");
		Y = entrada.nextInt();
		
		resultado = (X * Y) / 2;
		
		System.out.println("A área do triângulo retângulo é : " + resultado);
		
		entrada.close();
		
	}

}