import java.util.concurrent.ThreadLocalRandom;

public class exemploWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce de valor: " + valorDoce + " adicionado ao carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a mesada om doces");c
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
