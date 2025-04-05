import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Nome do Cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o Numero da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a Agencia da Conta: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.print("Ola, " + nome + " obrigado por criar uma conta em nosso banco, sua conta é " + numero + " e sua agencia é " + agencia + " e seu saldo " + saldo + " ja esta disponivel para saque. ");
    }
}
