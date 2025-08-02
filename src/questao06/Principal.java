package questao06;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        int num1,num2,num3;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite um numero inteiro:");
        num1=entrada.nextInt();
        System.out.print("Digite um numero inteiro:");
        num2=entrada.nextInt();
        System.out.print("Digite um numero inteiro:");
        num3=entrada.nextInt();

        if(num1<num2 && num1<num3) {
            System.out.print("" + num1 + " é o menor dos três!");
        }
            else if(num2<num1 && num2<num3) {
            System.out.print("" + num2 + " é o menor dos três!");
        }
                else{
                    System.out.print("" + num3 + " é o menor dos três!");
                }
        }
    }
