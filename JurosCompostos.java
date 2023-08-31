package santanderJava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        for (int ano = 1; ano <= periodo; ano++) {
            valorFinal *= (1 + taxaJuros);
        }


        System.out.printf("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}