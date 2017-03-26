package com.calculatrice;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		float a, b, result;
		char operator = '#', recommencer ='N';
		
		System.out.println("Bonjour et bienvenue dans la calculatrice");
		//coeur du programme
		do{
			a = askFloat("Entrez le premier nombre");
			while(operator != '+' && operator != '-' && operator != '/' && operator != '*'){
				operator = askChar("Rentrez l'opérateur !");
			}
			b = askFloat("Entrez le deuxième nombre");
			result = calculer(a, operator, b);
			System.out.println("Le résultat de "+a+" "+operator+" "+b+" = "+result);
			recommencer = askChar("Voulez-vous recommencer?(O/o pour recommence)");
		}while(recommencer == 'O' || recommencer == 'o');
	}
	public static float askFloat(String message){
		//déclarer variables
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
	return result;
	}
	
	public static char askChar(String message){
		//déclarer les variables
		Scanner clavier = new Scanner(System.in);
		char result = 0;
		boolean isOk = false;
		String line;
		
		//récupération du char
		while(!isOk){
			try{
				//Instruction à faire
				line = clavier.nextLine();
				result = line.charAt(0);
				isOk = true;
			}catch(Exception e){
				//Instruction à faire si problème
				clavier.nextLine();
				isOk = false;
				
			}
		}
	 return result;
	}

	public static float calculer(float a, char operator, float b){
		// déclarer les variables
		float result = 0;
		switch(operator){
		case '/':
			if(b == 0){
				System.out.println("Erreur: Division par zero !");
				System.exit(0);
			}
			result = a / b;
			break;
		case '*':
			result = a * b;
			break;
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		default:
			System.out.println("Erreur: opérateur inconnu");
			System.exit(0);
	}
		return result;
	}
}
