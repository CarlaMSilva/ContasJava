import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: \n");
        int numero = sc.nextInt();

        sc.nextLine();
        System.out.println("Por favor, digite o numero da Agência: \n");
        String agencia = sc.nextLine();


        System.out.println("Por favor, digite o nome do cliente: \n");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo: \n");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +","+
                " " + " obrigado por criar uma conta em nosso banco, sua agência é: " +
                " " + agencia +
                " " + "conta: " + numero +
                " e seu saldo: " + saldo + ", já está disponível para saque.");

    }
}