import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua série favorita: ");
        String serie = leitura.nextLine();
        System.out.println(serie);
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação para a série ");
        double avaliacao = leitura.nextDouble();

        System.out.println(serie);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
