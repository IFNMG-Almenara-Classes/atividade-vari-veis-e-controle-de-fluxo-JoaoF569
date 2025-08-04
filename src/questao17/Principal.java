package questao17;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int num,resultado;
        System.out.print("Digite um número inteiro:");
        num=entrada.nextInt();
        resultado=num;
        for(int i=num-1;i>0;i--){
            resultado=resultado*i;
        }
        System.out.print(resultado);
    }
}
