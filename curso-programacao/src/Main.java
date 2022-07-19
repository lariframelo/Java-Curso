import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x ;
        int y ;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        sc.close();



        /*      AULA FORMATAÇÃO


        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290; char gender = 'F';
        double price1 = 2100.0; double price2 = 650.50; double measure = 53.234567;


        System.out.println("Products:");
        System.out.println("Computer, which price is $ " + price1 );
        System.out.println("Office desk, which price is $ " + price2);
        System.out.println();
        System.out.println("Record:" + age + " years old, code "+ code + " and gender: " + gender);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

        */
    }
}
