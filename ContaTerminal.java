package edu.lucas.ContaBancária;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o nome da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String usuario = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextInt();
        
        
        System.out.println("Olá" + usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo, no valor de R$" + saldo + " já está disponível para saque. Seja bem-vindo!");

    }

}
