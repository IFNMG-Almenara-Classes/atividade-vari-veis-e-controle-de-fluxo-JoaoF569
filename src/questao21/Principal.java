package questao21;
import java.util.Scanner;
public class Principal {

    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int idade,trabalho;
        System.out.println("Digite sua idade:");
        idade=entrada.nextInt();
        System.out.println("Digite seu tempo de trabalho");
        trabalho=entrada.nextInt();
        if(idade>64 || trabalho>29)
            System.out.println("Você ja pode se aposentar");
        else if(idade>59 && trabalho>24)
            System.out.println("Você ja pode se aposentar");
        else
            System.out.println("Você ainda não pode se aposentar");
    }

}
