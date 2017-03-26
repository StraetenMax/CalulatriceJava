package com.calculatrice;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static float askFloat(String message){
		Scanner clavier = new Scanner(System.in);
		float result = 0;
		boolean isOk = false;
		
		// récupération du float
		while(!isOk){
			System.out.println();
		try{
			//instruction à faire
			result = clavier.nextFloat();
			isOk = true;
		}catch(Exception e){
			//instruction à faire si probleme
			clavier.nextLine();
			isOk = false;
		}
		}
	}
	
}
