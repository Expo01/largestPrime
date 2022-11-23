package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(22));
    }

    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }
        for(int i = 2; i < number; i++)
            if (number % i == 0) {
                return getLargestPrime(number / i);
            }
        return number;
    }
    //student solution using recursion

    public static int getLargestPrime2(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
    //second student soltuion

}

//come back to this problem
