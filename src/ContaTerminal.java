import java.text.DecimalFormat;
import java.util.Scanner;


public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0;
        DecimalFormat df = new DecimalFormat("#,###.00");
        String valorFormatado = df.format(saldo);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número da conta: ");
            numeroConta = scanner.nextInt();
            System.out.print("Digite o número de sua agência: ");
            agencia = scanner.next();
            System.out.print("Digite seu nome: ");
            nomeCliente = scanner.next();
            System.out.print("Digite o saldo: ");
            saldo = scanner.nextDouble();
            valorFormatado = df.format(saldo);

        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência %s, conta %d e seu saldo %s já está disponível para saque", nomeCliente, agencia, numeroConta, valorFormatado);

    }
}
