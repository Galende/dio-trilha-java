package udemy;

import java.util.Scanner;

public class CalculoDeSaldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        double saldoAtual = scanner.nextDouble();

        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();

        System.out.print("Digite o valor da retirada: ");
        double valorRetirada = scanner.nextDouble();

        double saldoAtualizado = equilibrarSaldo(saldoAtual, valorDeposito, valorRetirada);

        System.out.println("Saldo atualizado na conta: " + String.format("%.1f", saldoAtualizado));

        scanner.close();
    }

    public static double equilibrarSaldo(double saldoAtual, double valorDeposito, double valorRetirada) {
        saldoAtual += valorDeposito - valorRetirada;
        return saldoAtual;
    }
}

