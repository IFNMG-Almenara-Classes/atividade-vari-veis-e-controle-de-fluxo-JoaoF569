package questao02;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        float imc;
        float peso;
        float altura;
        System.out.print("Digite o seu peso:");
         peso= entrada.nextFloat();
        System.out.print("Digite a sua altura:");
         altura= entrada.nextFloat();
        imc= peso/(altura*altura);

        if(imc<18.5)
            System.out.println("Seu imc é: "+ imc +" e você está muito magro.");
        else if(imc<=24.9)
            System.out.println("Seu imc é: "+ imc +" e você está saudável.");
        else if(imc<=29.9)
            System.out.println("Seu imc é: "+ imc +" e você está em sobrepeso.");
        else if(imc<=34.9)
            System.out.println("Seu imc é: "+ imc +" e você tem obesidade grau I.");
        else if(imc<=39.9)
            System.out.println("Seu imc é: "+ imc +" e você tem obesidade grau II(Severa).");
        else
            System.out.println("Seu imc é: "+ imc +" e você tem obesidade grau III(Mórbida).");
        }
    }

