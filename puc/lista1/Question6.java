package com.aed.puc.lista1;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		//Faça um programa para calcular e mostrar o tempo de deslocamento de um móvel. Obs: T = D / V.
		
		Scanner entrada = new Scanner (System.in);
		int X, Y, resultado;
		
		System.out.print ("Digite a distância percorrida (Km): ");
		X = entrada.nextInt();
		
		System.out.print ("Digite a velocidade média (Km/h): ");
		Y = entrada.nextInt();
		
		resultado = X / Y;
		
		System.out.println("O tempo gasto na viagem foi: " + resultado + "Horas");

		entrada.close();
		
	}

}