package questao3;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um número:");
    int num=entrada.nextInt();
    if(num%2==0)
        System.out.print("O número é par");
    else
        System.out.print("O número é ímpar");
}
}
