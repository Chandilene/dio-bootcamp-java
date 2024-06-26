public class planoTelefone {
    public static void main(String[] args) {
        String plano = "B";

        /*
         * if (plano == "B") {
         * System.out.println("100 min de ligação.");
         * } else if (plano == "M") {
         * System.out.println("100 min de ligação +");
         * System.out.println("Whats e Instagram grátis");
         * } else if (plano == "T") {
         * System.out.println("100 min de ligação +");
         * System.out.println("Whats e Instagram grátis +");
         * System.out.println("5GB de Youtube");
         * }
         */

        // swith-case

        switch (plano) {
            case "T":
                System.out.println("5GB de Youtube +");
            case "M":
                System.out.println("Whats e Instagram grátis +");
            case "B":
                System.out.println("100 min de ligação ");

            default:
                break;
        }

    }
}
