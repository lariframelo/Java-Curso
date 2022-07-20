import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int codeP1,codeP2,qtdP1,qtdP2;
        double valorUniP1, valorUniP2, total;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        codeP1 = sc.nextInt();
        qtdP1 = sc.nextInt();
        valorUniP1 = sc.nextDouble();
        sc.nextLine();
        codeP2 = sc.nextInt();
        qtdP2 = sc.nextInt();
        valorUniP2 = sc.nextDouble();

        total = (qtdP1 * valorUniP1) + (qtdP2 * valorUniP2);
        System.out.printf("VALOR A PAGAR = R$ %.2f", total);



    }
}
