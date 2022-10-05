package com.aed.puc.lista2;
import java.util.*;

public class Question5 {

	public static void main(String[] args){
		/*Faça um programa que funcione como uma calculadora entre dois
		números quaisquer, que permita escolher calcular a soma,
		subtração, divisão ou multiplicação entre eles.
		*/
		
		Scanner entrada = new Scanner (System.in);
		int escolha;
		float dig1=0, dig2=0, resultado;
		
		System.out.print("Escolha a operação desejada: \n1- Adição \n2-Subtração \n3- Multiplicação \n4- Divisão \nInsira aqui : ");
		escolha = entrada.nextInt();
		
		if ((escolha <1)||(escolha >4)) {
			System.out.print("Opção Inválida!");
		} else {
			System.out.print("Insira o primeiro número: ");
			dig1 = entrada.nextFloat();
			
			System.out.print("Insira o segundo número: ");
			dig2 = entrada.nextFloat();
		}
		
		switch(escolha) {
		case 1:
		resultado = dig1 + dig2;
		System.out.print("O resultado da soma é: " + resultado);
		break;
			
		case 2:
		resultado = dig1 - dig2;
		System.out.print("O resultado da subtração é: " + resultado);
		break;
		
		case 3:
		resultado = dig1 * dig2;
		System.out.print("O resultado da multiplicação é: " + resultado);
		break;
			 
		case 4:
		resultado = dig1 / dig2;
		System.out.print("O resultado da divisão é: " + resultado);
		break;
		default:
		}
		
		entrada.close();
			 
	}
}