package edu.chandilene.operadoresemJava;

public class OperadoresTernarios {
    public static void main(String[] args) {
        int a, b;
        a = 6;
        b = 6;

        /*
         * String resultado = "";
         * USANDO IF E ELSE
         * if (a == b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         * 
         * System.out.println(resultado);
         */

        // USANDO OPERADOR TERNARIO

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
