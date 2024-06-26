public class resultadoEscolarComposto {
    public static void main(String[] args) {
        // condicional composta encadeada
        int nota = 7;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("reprovado!");
    }
}
