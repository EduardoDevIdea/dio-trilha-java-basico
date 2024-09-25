import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

       criarConta();

    }

    public static void criarConta(){

        Scanner sc =  new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o nome do cliente:");
        String NomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo:");
        double saldoCliente = sc.nextDouble();
        String saldo = new DecimalFormat("###,###.00").format(saldoCliente);

        String mensagemContaCriadaComSucesso = "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +  " já está disponível para saque.";

        System.out.println(mensagemContaCriadaComSucesso);

        sc.close();

    }
       
}
