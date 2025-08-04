package questao14;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int valor,cliente,desconto,valorFinal;
        System.out.print("Qual o valor da pizza? ");
        valor=entrada.nextInt();
        System.out.print("Que tipo de cliente você é?\n1-Comum\n2-VIP\n3-Funcionário\n");
        cliente=entrada.nextInt();
        switch(cliente){
            case (1):
                System.out.print("Valor final:"+ valor +"");
                break;
            case (2):
                desconto=(valor*5)/100;
                valorFinal=valor-desconto;
                        System.out.print("Valor final:R$"+ valorFinal +"");
                        break;
            case (3):
                desconto=(valor*10)/100;
                valorFinal=valor-desconto;
                System.out.print("Valor final:R$"+ valorFinal +"");
                break;
        }
    }
}
