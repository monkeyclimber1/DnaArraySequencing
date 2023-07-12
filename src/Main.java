import java.util.ArrayList;

class Playlist {

        // Add your methods here:
        public static boolean isPrime(int number){
            if(number == 2){
                return true;
            }
            else if(number < 2){
                return false;
            }
            for(int i = 2; i < number; i++){
                if(number % i ==0){
                    return false;
                }

            }
            return true;
        }
    public static ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int number:numbers){
            if(isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }


    public static void main(String[] args) {

        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(onlyPrimes(numbers));
     

    }

}