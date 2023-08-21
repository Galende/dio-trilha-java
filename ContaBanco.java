
import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Por favor digite o número da sua conta: ");
        int conta = sc.nextInt();

        System.out.println("Por favor digite o número da sua agência: ");
        String agencia = sc.next();

        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Seu saldo é de: ");
        String saldoStr = sc.next();
        double saldo = Double.parseDouble(saldoStr);

        System.out.println("Olá senhor " +
                nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " +
                conta + " e seu saldo " +
                saldo + " já está disponível para saque!");

        sc.close();
    }
}
