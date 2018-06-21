package util;


import java.util.Random;
import logic.*;


public class Test {
    public static void main(String[] args) {
        testGetSumOfDigits();
        testPow();
        testGetFibonachiByNumber();
    }

    public static void testGetSumOfDigits(){
        System.out.println("---------- Test sum of digits ----------");
        Random random = new Random();
        int i = random.nextInt(999);
        System.out.println("Number = " + i);
        System.out.println("Sum of digits = " + RecursiveAlgorithm.getSumOfDigits(i));

    }
    public static void testPow(){
        System.out.println("---------- Test pow ----------");
        System.out.println( RecursiveAlgorithm.pow(1.45, 5));
        System.out.println( RecursiveAlgorithm.pow(2, 3));
        System.out.println( RecursiveAlgorithm.pow(-5, 2));
    }


    public static void testGetFibonachiByNumber(){
        System.out.println("---------- Test fibonachi ----------");
        Random random = new Random();

        for (int i = 1; i < 10; i++ )
        System.out.println(i + " " + RecursiveAlgorithm.getFibonachiByIndex(i));
    }
}
