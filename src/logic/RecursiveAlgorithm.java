package logic;


public class RecursiveAlgorithm {

    public static int getSumOfDigits(int number){
        if (number < 0) {
            number = -number;
        }
        if (number == 0 ){
            return 0;
        }
        return number % 10 + getSumOfDigits(number / 10);
    }

    public static double pow(double x, int n){
        if (n == 0){
            return 1;
        }
        return x * pow(x, n - 1);
    }

    public static boolean equals(int n, int s){
        return getSumOfDigits(n) == s;
    }

    public static int getFibonachiByIndex(int index){
        if (index < 1){
            return -1;
        }
        if (index == 1){
            return 0;
        }
        if (index == 2){
            return 1;
        }
        return ( getFibonachiByIndex(index - 2 ) + getFibonachiByIndex(index - 1) );
    }

}
