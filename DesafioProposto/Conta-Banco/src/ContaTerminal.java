import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
      
        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine();// Consumir a quebra de linha após o número da conta
        
        System.out.println("Por favor, digite o número da Conta:");
        String cCorrente = scanner.nextLine();
        

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close(); // Fechar o scanner após a leitura dos dados

        // Exibir as informações da conta bancária
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + cCorrente + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
