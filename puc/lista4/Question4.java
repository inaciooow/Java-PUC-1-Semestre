package com.aed.puc.lista4;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		/*Faça um programa que calcule o Fatorial de um número inteiro e positivo,
		onde n ! = n x (n-1) x (n-2) x ...... x 2 x 1
		Exemplo: 4! = 4 x 3 x 2 x 1 4! = 24
		*/
		
		Scanner entrada = new Scanner (System.in);
		int x, y, f;
		y=0;
		f=1;
		
		System.out.print("Digite um número: ");
		x = entrada.nextInt();
		y = x;
		
		while (x>=1) {
			f = f * x;
			x = x - 1;
		}
		
		System.out.printf(""+y+"!= "+"%d",f);
		
		entrada.close();
	}

}