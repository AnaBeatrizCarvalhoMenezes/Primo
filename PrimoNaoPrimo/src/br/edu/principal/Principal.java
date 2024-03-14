package br.edu.principal;
import java.util.Scanner;
public class Principal {
 /**
  * Author: Ana Beatriz;
  * Date: 12/03/2024;
  * Propose: This project should receive a positive integer value and tell if it is prime or not;
  * Also should print all prime numbers bellow this value and count how much primes theres in it.
  * Last modification: 14/03/2024.
  */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero, div, valor;//Variáveis
		
		System.out.println("Digite um valor inteiro positivo: ");
		numero = sc.nextInt();//Número do cálculo	
		sc.close();
		System.out.println("Conferindo, o valor digitado foi " + numero);
		
		if (numero > 0) {
			div = 0;
			valor = 1;
			
			for(int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					div++;
				}//Fim If de acréssimo
			
				while(valor<numero){
					valor++;
					if(div == 2) {
						System.out.println("O número " + valor + " também é primo!");
					}//Primo
					else {
						System.out.println("O número " + valor + " NÃO é primo!");
					}//Não primo
		        }//fim while
				
			}//Fim For de acréssimo
			if(div == 2) {
				System.out.println("O número " + numero + " é primo!");
			}//Primo
			else {
				System.out.println("O número NÃO é primo!");
			}//Não primo
			
		}//Fim If inicializando div e valor
			
		else {
			System.out.println("O número digitado é menor ou igual a 0!");
		}//Fim else 0
					
	}//Fim main void

}//Fim classe
