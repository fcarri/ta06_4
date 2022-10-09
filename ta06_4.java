package project6;

import java.util.Scanner;

public class ta06_4 {
	public static void main(String args[]){
		
		double nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcul del factorial");
		System.out.print("Introdueix nombre: ");
		nombre = sc.nextDouble();
		System.out.print("factorial de "+nombre+" és "+factorial(nombre));
		
		sc.close();
	}
	
	public static double factorial(double nombre) {	
		
		double fact = 1; 
		
		for(int i=1;i<=nombre;i++){    
		     fact=fact*i;    
		 }    
		
		return fact;
	}

}
