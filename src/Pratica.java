import java.util.Locale;
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        

        // System.out.println("Digite o seu nome: ");
        // String nome = entrada.nextLine();
        // System.out.println("Seja bem vindo: " + nome);

        System.out.println("Digite a sua altura:");
        double altura = entrada.nextDouble();
        System.out.println("Sua altura é " + altura);


        entrada.close();
    }
}
