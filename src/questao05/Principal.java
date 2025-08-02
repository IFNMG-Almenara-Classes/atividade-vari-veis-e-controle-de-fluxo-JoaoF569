package questao05;
import java.util.Scanner;
public class Principal {
    public static void main(String args[]){
        int laranjas;
        float preço=0;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Quantas laranjas você deseja comprar? ");
        laranjas = entrada.nextInt();

        if(laranjas<12){
            for(int i=0;i<laranjas;i++){
                preço+=0.50;
            }
            }
        else{
            for(int i=0;i<laranjas;i++){
                preço+=0.30;
            }
        }
        System.out.printf("Valor total da compra: R$%.2f ", preço);
    }
}
