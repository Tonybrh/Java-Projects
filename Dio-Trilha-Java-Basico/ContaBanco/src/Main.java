import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Por favor digite seu nome!");
        conta.setNomeCliente(scanner.nextLine());
        System.out.println("Por favor digite o número da conta!");
        conta.setNumero(scanner.nextInt());
        System.out.println("Por favor digite a agência!");
        conta.setAgencia(scanner.next());
        System.out.println("Por favor digite o saldo!");
        conta.setSaldo(scanner.nextDouble());
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + "conta " + conta.getNumero() + "e seu saldo " + conta.getSaldo() + " já está disponível para saque");
    }
}