import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double media, numeroInformado, soma = 0;
		int quantidadeNumeros, i;

		System.out.println("Informe a quantidade de números que você vai passar:");
		quantidadeNumeros = entrada.nextInt();

		for (i = 1; i <= quantidadeNumeros; i++) {

			System.out.println("Informe o " + i + "º número");
			numeroInformado = entrada.nextDouble();
			soma = soma + numeroInformado;

		}

		media = soma / quantidadeNumeros;

		System.out.println("A média é: " + media);

		entrada.close();
	}

}
