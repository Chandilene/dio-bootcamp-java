import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class processoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {
                "João", "Maria", "Ana", "Pedro", "Carla" };
        for (String candidato : candidatos) {
            entrarEmContado(candidato);
        }
    }

    static void entrarEmContado(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else
                System.out.println("Contato realizado com sucesso");
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas");
        } else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas "
                    + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimmirCandidatos() {
        String[] candidatos = {
                "João", "Maria", "Ana", "Pedro", "Carla" };
        System.out.println("imprimeindo a lista de candidatos selecionados.");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
                "João", "Maria", "Ana", "Pedro", "Carla",
                "Lucas", "Paula", "Tiago", "Fernanda", "Rafael"
        };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDITADO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR COM UMA CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS.");
        }
    }
}
