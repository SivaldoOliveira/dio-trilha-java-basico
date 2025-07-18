import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criando o objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Coletando dados do usuário

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do nextInt()

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        // exibindo os dados coletados
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco."
                + " Sua Agência é: " + numeroAgencia + ", conta: " + numeroConta + " e seu saldo de R$ "
                + saldoConta + " já está disponível para saque. ");

        // Fechando o scanner
        scanner.close();

    }
}
