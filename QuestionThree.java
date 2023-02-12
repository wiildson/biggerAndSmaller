/*
 Crie um algoritmo usando While que solicite ao usuário a entrada de N números inteiros e positivos, no final
exiba o menor e o maior número digitado.
Obs: Para encerrar o programa, o usuário deve
digitar um número menor que 0.
 */


package QuestionThree;

import java.util.Locale;
import java.util.Scanner;

public class QuestionThree {

	public static int numero=0;
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int maior=0;
		int menor=0;
		
		
		while(numero>=0) {
		
		System.out.println("Digitite um número inteiro e positivo:");
		numero = sc.nextInt();
		
	
		if (numero > maior) {
			maior=numero;
		}
		else if (numero < menor) {
			menor=numero;
		}
		}
		
		System.out.println("O maior número digitado até então foi: " + maior);
		System.out.println("O menor número digitado até então foi: " + menor);
		
		
		
		}

}