import java.util.Scanner;

public class ContaUsuario {
    public static void main(String[] args) {
        // Criando o objeto Scanner para capturar dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        // Solicitar o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        // Solicitar o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine(); // Limpar o buffer de entrada
        String nomeCliente = scanner.nextLine();

        // Solicitar o saldo da conta
        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        // Criar a instância de Conta com os dados inseridos
        ContaBancaria conta = new ContaBancaria(numeroConta, agencia, nomeCliente, saldo);

        // Exibir as informações da conta
        conta.exibirInformacoes();

        // Fechar o scanner
        scanner.close();
    }
}

