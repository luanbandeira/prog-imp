public class ExemploPrimos {
    public static void main(String[] args) {
        int limite = 5;    
        System.out.print("{");
        for (int num = 2; num <= limite; num++){
            int divisores = 0;
            for(int divisor = 2; divisor<= Math.sqrt(num); divisor++){
                if (num % divisor == 0) {
                    divisores++;
                    break;
                    
                }
            }
            if (divisores == 0){
                System.out.print(num + ", ");
            }
        }
        System.out.print("}");
}   }
