 public class Main {
    public static  void main(String [] args){
        String text = "cos" + "cos2";
        int oskar = 5 + 5 + 5 * 5 + 5 - 5;
        oskar = oskar / 5; // == oskar /= 5;
        oskar /= 5;

        oskar = oskar + 1;
        oskar += 1;
        oskar++;

        oskar = oskar * 10 - oskar;
        float rest = 4f;
        rest = rest % 10f;

        System.out.println(text);

        // Wylicz podatek VAT z kwoty 5432
        //BigDecimal
        //BigInteger
        float cos = 0.10f/0.9f;
        System.out.println(cos);

        // Wylicz podatek dochodowy
        int salaray = 5000;
        int cost = 1300;



        float tax = (salaray - cost) * 0.18f;
        System.out.println(tax);

    }
}
