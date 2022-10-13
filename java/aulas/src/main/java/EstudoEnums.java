public class EstudoEnums {
    //enums são sao estruturas com constantes definidas
    public static void main (String[] args){
        enum DiasDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiasDaSemana hoje = DiasDaSemana.DOMINGO;
        System.out.println(hoje);


        enum NivelDev {JUNIOR, PLENO, SENIOR}
        NivelDev nivelSelecionado =  NivelDev.SENIOR;

        switch(nivelSelecionado){
            case JUNIOR:
                System.out.println("NIVEL JUNIOR");
                break;
            case PLENO:
                System.out.println("NIVEL PLENO");
                break;
            case SENIOR:
                System.out.println("NIVEL SENIOR");
            break;
        }

        // VERSÃO ENHANCED
        NivelDev nivelSelecionado2 =  NivelDev.JUNIOR;

        switch(nivelSelecionado2) {
            case JUNIOR -> {
                System.out.println("Seu nível é JUNIOR");
            }
            case PLENO -> {
                System.out.println("Seu nível é PLENO");
            }
            case SENIOR -> {
                System.out.println("Seu nível é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }
        }
    }
}
