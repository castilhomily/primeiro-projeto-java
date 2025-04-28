public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2018;
        boolean incluindoNoPlano = true;
        double notaDaSerie = 9.2;
        String tipoPlano = "normal";

            // código omitido

            if (incluindoNoPlano == true && tipoPlano.equals("plus")){
                System.out.println("Filme liberado");
            } else {
                System.out.println("Deve pagar a locação");
            }
        }
    }
