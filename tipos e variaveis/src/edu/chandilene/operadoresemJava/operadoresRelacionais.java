package edu.chandilene.operadoresemJava;

public class operadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2) {
            System.out.println("A nossa condição é verdadeira");
        } else
            System.out.println("falso");

        System.out.println("Numero1 é igual ao numero2 ? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero1 é diferente do numero2 ? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero1 é maior que numero2 ? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("Numero1 é menor ou igual ao numero2 ? " + simNao);

    }
}
