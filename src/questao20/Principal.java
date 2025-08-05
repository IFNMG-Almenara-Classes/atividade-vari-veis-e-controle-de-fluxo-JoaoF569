package questao20;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        System.out.print("Digite um número inteiro:");
        num1 = entrada.nextInt();
        if (num1 % 3 == 0 && num1 % 5 == 0)
            System.out.print("Erro. O número é divisível por 3 e por 5 ao mesmo tempo.");
        else if (num1 % 3 == 0 && num1 % 5 != 0)
                System.out.print("O número é divisível por 3.");
            else if (num1 % 3 != 0 && num1 % 5 == 0)
                    System.out.print("O número é divisível por 5.");
            else
            System.out.print("O número não divisível por 3 e nem por 5.");
    }
}
