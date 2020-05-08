//usuário deve informar nome do imposto
//percentual a ser aplicado sobre valor total
//valor para calculo
//resultado do calculo acrescido da mensagem informativa para usuário
//fim

import java.util.Scanner;

public class programair {

	public static void main(String[] args){

Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome do imposto");
		String nomeImposto;
		nomeImposto = leitor.nextLine();

	//Scanner percentual = new Scanner(System.in);
		System.out.println("Digite o percentual do imposto");
		float percentualImposto;
		percentualImposto = leitor.nextFloat();

	//Scanner valor = new Scanner(System.in);
		System.out.println("Digite valor para calculo");
		float valorCalculo;
		valorCalculo = leitor.nextFloat();

		System.out.println("o valor do imposto " + nomeImposto + " a pagar eh: " + (((percentualImposto/100)*valorCalculo)+valorCalculo));
		
}
	}