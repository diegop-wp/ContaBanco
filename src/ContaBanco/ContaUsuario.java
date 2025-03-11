package ContaBanco;

import java.util.Scanner;

public class ContaUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();


        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();


        System.out.println("Por favor, digite o nome do cliente:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();


        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();


        ContaBancaria conta = new ContaBancaria(numeroConta, agencia, nomeCliente, saldo);


        conta.exibirInformacoes();


        scanner.close();
    }
}

