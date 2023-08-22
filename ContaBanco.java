package udemy;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha pendente

        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome:");
        String cliente = sc.nextLine();

        System.out.println("Por favor, digite seu saldo atual: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá senhor "
                + cliente + "! Obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + " e conta "
                + conta + ", seu saldo atual é de "
                + saldo + " e já está disponível para saque!");

        sc.close();
    }
}