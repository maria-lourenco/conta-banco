import java.util.Date;
import java.util.Scanner;

public class ContaTerminal {

    public String nome;
    public String cpf;
    public Date dataNascimento;
    public int agencia;
    public int numeroDaConta;
    public double saldo;


    
public static void main(String[] args) {

    
 
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Olá! Vamos criar a sua conta , me passa alguns dados por favor ...");
        System.out.println("------------------------------------------------------------------");

        System.out.println("Qual o seu nome completo?");
        String nome = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite seu CPF : ");
        String cpf = scanner.next();
        scanner.nextLine();

        System.out.println("Digite sua data de nascimento dd/mm/aaa: ");
        String dataNascimento = scanner.next();

        System.out.println("------------------------------------------------------------------");

        System.out.println("Olá " + nome + "! SEJA BEM VINDO(A)!" );
        System.out.println("");
        
        System.out.println("Esses são os dados da sua conta bancária : ");
        System.out.println("");

        System.out.println("Agencia : 1234" );
        System.out.println("Conta : 123456-7"  );
        System.out.println("CPF :" + cpf );
        System.out.println("D/N :" + dataNascimento );
        System.out.println("Saldo : R$ 0.0" );
    }
    


    
}


}


