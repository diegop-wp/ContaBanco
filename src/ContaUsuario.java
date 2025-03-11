import java.util.Scanner;

public class ContaUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        // Solicitar o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        // Solicitar o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        // Solicitar o saldo da conta
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();


        ContaBancaria conta = new ContaBancaria(numeroConta, agencia, nomeCliente, saldo);

        // Exibir as informações da conta
        conta.exibirInformacoes();


        scanner.close();
    }
}

