import java.util.Scanner;

public class BancoAzul{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        double saldo = 0;
        String extrato = "";
        int numeroSaques = 0;
        int limiteSaques = 3;
        double limiteValor = 500;


        while(true){
            System.out.println("==========================");
            System.out.println("   Seleciona uma opção:");
            System.out.println("      [d] - Depósito");
            System.out.println("      [s] - Saque");
            System.out.println("      [e] - Extrato");
            System.out.println("      [q] - Quit");
            System.out.println("==========================");

            String menu = scanner.nextLine();
            
            if (menu.equals("d")){
                System.out.println("Informe o valor do deposito: R$");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                if (valor > 0){
                    // saldo = saldo + valor;
                    saldo += valor;
                    // extrato = extrato + `Deposito de R$ ${valor}`;
                    extrato += "Deposito de R$ " + valor + "\n";
                    System.out.println("Deposito de R$: " + valor + " feito");
                } else {
                    System.out.println("@@@ Operação falhou! O valor informado é invalido! @@@");
                }
            } else if (menu.equals("s")){ //operação saque
                System.out.println("Informe o valor do saque: R$");
                int valor = scanner.nextInt();

                boolean excedeuSaques = numeroSaques >= limiteSaques;
                boolean excedeuLimiteValor = valor > limiteValor;
                boolean excedeuSaldo = valor > saldo; 
                // nao pode ter mais que 3 saques diarios 
                // valor nao pode ser > 500 
                // valor nao pode ser > que saldo 
                if (excedeuSaldo){
                    System.out.println("@@@ Operação falhou! Saldo insuficiente para saque @@@");
                } else if (excedeuSaques){
                    System.out.println("@@@ Operação falhou! O numero maximo de saques foi excedido @@@");
                } else if (excedeuLimiteValor){
                    System.out.println("@@@ Operação falhou!  @@@");
                } else {
                    // saldo = saldo - valor;
                    saldo -= valor;
                    // extrato = extrato + `Deposito de R$ ${valor}`;
                    extrato += "Saque de R$ " + valor + "\n";
                    System.out.println("Saque de " + valor + "realizado com sucesso!");
                    numeroSaques++;
                }
            } else if (menu.equals("e")){
                if (extrato.isEmpty()){
                    System.out.println("Não foram realizadas movimentações.");
                } else {
                    System.out.println(extrato);
                    System.out.println("Saldo : R$ " + saldo);
                    System.out.println("==========================");
                }
                    
            } else if (menu.equals("q")){
                System.out.println("Obrigado pela preferência !!! ");
                break;
            }   
        } 
    scanner.close();
    }
}