import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== CADASTRO DE CONTA BANCO ===");

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite a agência: ");
        String agencia = scanner.next();

        System.out.print("Digite o nome e sobrenome do cliente: ");
        String nomeCliente = scanner.next();
        nomeCliente += " ";
        nomeCliente += scanner.next();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // imprimindo os dados da conta
        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é "
                + agencia + " , Conta " + numero + " e seu Saldo " + saldo
                + " já está dsponível para saque.");

        scanner.close();
    }
}
