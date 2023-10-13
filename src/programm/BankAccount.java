package programm;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem vindo ao banco DIO");
		System.out.print("Por favor digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Por favor digite o numero da agencia: ");
		String numeroAgencia = sc.next();
		
		System.out.print("Por favor digite o nome completo: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Por favor digite o saldo inicial: ");
		double saldo = sc.nextDouble();
		
		System.out.printf("Ola  %s , obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu saldo %.2f já está disponível para saque" ,nome , numeroAgencia, numeroConta, saldo );
		sc.close();
	}
}
