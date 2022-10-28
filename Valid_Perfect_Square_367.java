package com.mycompany.leetcode_puntos;

public class Valid_Perfect_Square_367 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }
    
    public static boolean isPerfectSquare(int num) {
        double raiz = 1.0;
        for (int k = 1; k < 100; k++){
            raiz = (raiz + num/raiz) / 2;
        }
        raiz = Math.round(raiz);
        return raiz * raiz == num;
    }
    
}
