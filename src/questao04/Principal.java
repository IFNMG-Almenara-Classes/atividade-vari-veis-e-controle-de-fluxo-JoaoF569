package questao04;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int senha;
        do {
            System.out.print("Digite a sua senha:");
            senha = entrada.nextInt();

            if (senha == 1234)
                System.out.print("ACESSO PERMITIDO!");
            else
                System.out.println("ACESSO NEGADO!");
        }while (senha != 1234);
    }
}
