package questao07;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int lado1,lado2,lado3;
        System.out.print("Digite o tamanho do primeiro lado:");
        lado1=entrada.nextInt();
        System.out.print("Digite o tamanho do segundo lado:");
        lado2=entrada.nextInt();
        System.out.print("Digite o tamanho do terceiro lado:");
        lado3=entrada.nextInt();

        if(lado1==lado2 && lado2==lado3){
            System.out.print("O seu triângulo é equilátero");
            }
            else if(lado1==lado2 && lado2!=lado3 || lado1==lado3 && lado2!=lado3 || lado2==lado3 && lado2!=lado1){
                System.out.print("O seu triângulo é isóceles");
        }
            else{
                System.out.print("O seu triângulo é escaleno");
        }
    }
}
