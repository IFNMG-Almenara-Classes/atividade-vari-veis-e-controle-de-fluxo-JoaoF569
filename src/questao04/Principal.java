package questao04;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua senha:");
        int senha = entrada.nextInt();

        if (senha == 1234)
            System.out.print("ACESSO PERMITIDO");
        else
            System.out.print("ACESSO NEGADO");
    }
}
