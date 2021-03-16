package Bank_App;
import java.util.Scanner;

import Logic_Bank.Bank;




//Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
//titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito
//inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua
//conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
//Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J�
//o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por
//exemplo).
//Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger
//isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque
//realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for
//suficiente para realizar o saque e/ou pagar a taxa.


//Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o
//informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre
//mostrando os dados da conta ap�s cada opera��o. 










//Enter account number: 8532
//Enter account holder: Alex Green
//Is there na initial deposit (y/n)? y
//Enter initial deposit value: 500.00
//Account data:
//Account 8532, Holder: Alex Green, Balance: $ 500.00
//Enter a deposit value: 200.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 700.00
//Enter a withdraw value: 300.00
//Updated account data:
//Account 8532, Holder: Alex Green, Balance: $ 395.00







public class Application {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter account number: ");
		Integer number = sc.nextInt();
		
		System.out.println("Name: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n)?: ");
		int op = sc.nextInt();
		
		double balance = 0;
		


		
		if(op == 1) {
			

			Bank bk = new Bank(number, holder, balance);

			
			System.out.println(bk.getNumber());
			
			System.out.println(bk.getHolder());
			
			System.out.println(bk.getBalance());
			
			

			
			
		}
		
		else if(op == 2){
			
			System.out.println("Enter initial deposit value: ");
			balance = sc.nextDouble();
			
			
			Bank bk = new Bank(number, holder, balance);
			
			System.out.println(bk.getNumber());
			
			System.out.println(bk.getHolder());
			
			System.out.println(bk.getBalance());
			
			

			
		}
		
		Bank bk = new Bank(number, holder, balance);

		System.out.println("update deposit ");
		Double balance2 = sc.nextDouble();
		
		//setBalance(balance2); 
		
		System.out.println(bk.getNumber());
		
		System.out.println(bk.getHolder());
		
		System.out.println(bk.getBalance());
		
		System.exit(0);
		

		
	}
		
		
		
		
		
		

	}

}
