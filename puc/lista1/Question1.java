package com.aed.puc.lista1;
import java.util.*;

public class Question1 {
	
	public static void main(String[] args) {
		//Faça um programa para somar 3 números inteiros quaisquer e mostrar o resultado.
		
		Scanner entrada = new Scanner (System.in);
		int X, Y, Z, resultado;
		
		System.out.print ("Digite o primeiro número: ");
		X = entrada.nextInt();
		
		System.out.print ("Digite o segundo número: ");
		Y = entrada.nextInt();
		 
		System.out.print ("Digite o terceiro número: ");
		Z = entrada.nextInt();
		 
		resultado = X + Y + Z;
		 
		System.out.println("A soma total é : " + resultado);
		
		entrada.close();
		
	}

}