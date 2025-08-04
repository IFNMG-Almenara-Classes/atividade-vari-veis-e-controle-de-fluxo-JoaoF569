package questao13;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
    Scanner entrada=new Scanner(System.in);
    int opção,num1,num2,resultado;
    do {
        System.out.print("1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-sair\n");
        opção = entrada.nextInt();
        if(opção<1 || opção>5){
            System.out.println("Opção inválida. Digite um número válido!");
        }
        switch (opção) {
            case (1):
                System.out.print("Digite o primeiro número:");
                num1 = entrada.nextInt();
                System.out.print("Digite o segundo número:");
                num2 = entrada.nextInt();
                resultado = num1 + num2;
                System.out.print("" + num1 + "+" + num2 + " = " + resultado + "\n");
                break;
            case (2):
                System.out.print("Digite o primeiro número:");
                num1 = entrada.nextInt();
                System.out.print("Digite o segundo número:");
                num2 = entrada.nextInt();
                resultado = num1 - num2;
                System.out.print("" + num1 + "-" + num2 + " = " + resultado + "\n");
                break;
            case (3):
                System.out.print("Digite o primeiro número:");
                num1 = entrada.nextInt();
                System.out.print("Digite o segundo número:");
                num2 = entrada.nextInt();
                resultado = num1 * num2;
                System.out.print("" + num1 + "*" + num2 + " = " + resultado + "\n");
                break;
            case (4):
                System.out.print("Digite o primeiro número:");
                num1 = entrada.nextInt();
                System.out.print("Digite o segundo número:");
                num2 = entrada.nextInt();
                resultado = num1 / num2;
                System.out.print("" + num1 + "/" + num2 + " = " + resultado + "\n");
                break;
        }
    }
    while(opção!=5);
    System.out.print("Saindo...");
}
}
