public class aa {
    public static void main(String[] args) {
        int max = 50;
        
        for (int num = 2; num <= max; num ++){
            int divisores = 0;
            for (int divisor = 2; divisor <= Math.sqrt(num); divisor++){
                if (num % divisor == 0) {
                    divisores ++;
                    break;
                    
                }

            }
            if (divisores == 0) {
                System.out.print(num + " ");
                
            }
        }
    }
    
}
