import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int conta;
        String agencia;
        String nome;
        Double saldo = 15.0;
        //Tconhecer e importar a classe Scanner 
        Scanner scan = new Scanner(System.in);
        //variaveis
        // exibir as mensagens para o ususario
        System.out.println("Digite seu Nome e tecle Enter");
        nome = scan.nextLine();
        
        System.out.println("Digite agencia");
        agencia = scan.nextLine();
        
        System.out.println("Digite numero da conta");
        conta = scan.nextInt();
        
        System.out.println("Ola " + nome + " obrigado por criar conta em nosso banco, sua gencia é "+ agencia+", conta "+ conta + " e seu saldo é R$ " +saldo+"" );
        
       

        // obter pela classe scaner os valores digitados no teminal
        // exibir a mensagem da conta criada
    }
}
