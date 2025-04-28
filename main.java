public class Main {
    public static void main(String[] args) {
        System.out.printf("Bem-vindo ao Screen Match!");
        System.out.println("Série: YOU");

        int anoDeLancamento = 2018;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDaSerie = 9.2;
        //Médias calculada pelas tres notas de telespectadores
        double media = (9.5 + 5.3 + 8.7) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Série YOU 
                Série sobre um homem aparente e encantador, mas psicopata, que se apaixona obsessivamente por mulheres
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}
