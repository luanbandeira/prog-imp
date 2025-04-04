import java.util.Scanner;
public class Exemplo05 {
     public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        int [] n = new int[10];
        recebeNumeros(n);
    }


    public static void recebeNumeros(int v[]){
        System.out.println("digite o primeiro numero: ");
        int num = input.nextInt();
        v[0] = num;

        System.out.println("N[0] = " + v[0]);
        for(int i = 1; i< v.length; i++){
            v[i] = v[i-1] * 2;
            System.out.println("N[" + i+ "]" + " = " + v[i]);
        }
    }
}
