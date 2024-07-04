public class formatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (cepInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws cepInvalidoException {
        if (cep.length() != 8)
            throw new cepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
