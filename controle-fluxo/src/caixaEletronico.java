public class caixaEletronico {
    public static void main(String[] args) {
        // Condicional Simples
        double saldo = 25.0;
        double valorSaque = 27.0;

        if (valorSaque < saldo)
            saldo = saldo - valorSaque;

        System.out.println(saldo);

    }
}
