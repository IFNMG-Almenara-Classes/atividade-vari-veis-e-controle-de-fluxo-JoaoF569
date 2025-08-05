package questao18;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, contador = 0;
        System.out.print("Digite um número inteiro:");
        num1 = entrada.nextInt();
        System.out.print("Digite um número inteiro(Maior que o primeiro):");
        num2 = entrada.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (i > 1) {
                boolean primo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    contador++;
                }
            }
        }
        System.out.println("Quantidade de números primos entre " + num1 + " e " + num2 + ": " + contador + "");
    }
}