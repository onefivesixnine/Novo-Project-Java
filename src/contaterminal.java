import java.util.Scanner;

public class contaterminal{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Obtendo dados do usuário
        System.out.print("Informe o número da conta : ");
        int numeroConta = entrada.nextInt();

        System.out.print("Informe o número da agência : ");
        char agencia = entrada.next().charAt(0);

        System.out.print("Informe o seu nome : ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Informe o saldo inicial: ");
        float saldo = entrada.nextFloat();


        // Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
