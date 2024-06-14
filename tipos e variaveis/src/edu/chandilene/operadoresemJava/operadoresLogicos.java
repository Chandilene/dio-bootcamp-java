package edu.chandilene.operadoresemJava;

public class operadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 || condicao2) {
            System.out.println("uma delas é verdadeira");
        }

        if (condicao1 && condicao2) {
            System.out.println("as duas são verdadeira");
        }
        System.out.println("fim");
    }
}
