import java.util.Scanner;

public class CalcMedia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double media, numeroInformado, soma = 0;
		int quantidadeNumeros, i;

		System.out.println("Informe a quantidade de n�meros que voc� vai passar:");
		quantidadeNumeros = entrada.nextInt();

		for (i = 1; i <= quantidadeNumeros; i++) {

			System.out.println("Informe o " + i + "� n�mero");
			numeroInformado = entrada.nextDouble();
			soma = soma + numeroInformado;

		}

		media = soma / quantidadeNumeros;

		System.out.println("A m�dia �: " + media);

		entrada.close();
	}

}
