import java.util.Random;
import java.lang.Math;
public class Exemplo07 {
    public static Random geradorAleatorio = new Random();
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            int aleatorio = geradorAleatorio.nextInt(5)+1; 
            System.out.println(aleatorio);
        }
    }
}
