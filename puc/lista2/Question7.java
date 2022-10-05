package com.aed.puc.lista2;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		/*Faça um programa que permita o cálculo de qualquer uma das grandezas físicas abaixo:
			- distancia, onde d = v * t ;
			- tempo, onde t = d / v ;
			- velocidade, onde v = d / t ;
		*/
		
		Scanner entrada = new Scanner (System.in);
		int escolha;
		float v, t, d, resultado;
		
		System.out.print("Escolha qual grandeza física deseja calcular: \n1- Distância \n2- Tempo \n3- Velocidade \nInsira aqui : ");
		escolha = entrada.nextInt();
		
		switch(escolha) {
		case 1:
		System.out.print("Insira a velocidade (Km/h): ");
		v = entrada.nextFloat();
		System.out.print("Insira o tempo (Horas): ");
		t = entrada.nextFloat();
		resultado = v * t;
		System.out.print("A distância é: " + resultado + " Km");
		break;
		
		case 2:
		System.out.print("Insira a distância (Km): ");
		d = entrada.nextFloat();
		System.out.print("Insira a velocidade (Km/h): ");
		v = entrada.nextFloat();
		resultado = d / v;
		System.out.print("O tempo é: " + resultado + " Horas");
		break;
		
		case 3:
		System.out.print("Insira a distância (Km): ");
		d = entrada.nextFloat();
		System.out.print("Insira o tempo (Horas): ");
		t = entrada.nextFloat();
		resultado = d / t;
		System.out.print("A velocidade é: " + resultado + " Km/h");
		break;
		default:
			
		System.out.print("Opção Inválida!");
		break;
		}
		
		entrada.close();

	}

}