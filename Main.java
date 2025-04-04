public import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    Scanner input = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {
 
        int [] n = new int[10];
        recebeNumeros(n);
 
    }
    
    public static void recebeNumeros(double v[]){
        System.out.println("digite o primeiro numero: ");
        int num = input.nextInt();
        v[0] = num;
        
        for(int i = 1; i< v.lenth; i++){
            v[i] = v[i-1] * 2;
            System.out.println("N[" + i+ "]" + " = " + v[i]  )
        }
    }
 
} {
    
}
