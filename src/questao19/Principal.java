package questao19;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int dia;
        System.out.print("Digite o número correspondente ao dia:");
        dia=entrada.nextInt();
        switch(dia){
            case(1):
                System.out.print("Domingo");
                break;
            case(2):
                System.out.print("Segunda-Feira");
                break;
            case(3):
                System.out.print("Terça-Feira");
                break;
            case(4):
                System.out.print("Quarta-Feira");
                break;
            case(5):
                System.out.print("Quinta-Feira");
                break;
            case(6):
                System.out.print("Sexta-Feira");
                break;
            case(7):
                System.out.print("Sábado");
                break;
        }
    }
}
