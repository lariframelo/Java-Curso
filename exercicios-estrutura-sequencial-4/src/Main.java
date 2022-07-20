import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        int numf;
        double horasTrabalhadas, valorHora, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        numf = sc.nextInt();
        sc.nextLine();
        horasTrabalhadas = sc.nextDouble();
        valorHora = sc.nextDouble();
        salario = horasTrabalhadas * valorHora;


        sc.close();

        System.out.println("NUMBER = " + numf);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
