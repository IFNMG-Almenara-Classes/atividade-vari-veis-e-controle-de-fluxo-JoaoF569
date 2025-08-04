package questao12;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        int num,somatorio=0,pares=0,media=0;
        Scanner entrada=new Scanner(System.in);
        do {
            System.out.print("Digite número inteiro(0 para sair):");
            num=entrada.nextInt();
            if(num!=0){
                somatorio++;
            }
            media+=num;
            if(num%2==0 && num!=0){
                pares++;
            }
        }while(num!=0);
        media=media/somatorio;
        System.out.print("Quantidade de números pares:"+ pares +"\nMédia de todos os números:"+ media +"");

    }
}
