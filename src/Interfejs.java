import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Interfejs {

    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kot kot = new Kot();

        System.out.print("Podaj imię kota: ");
        kot.setImie(getUserInput());

        System.out.print("Podaj, kto jest opiekunem kota: ");
        kot.setImieOpiekuna(getUserInput());

        Pattern wzorzecDaty = Pattern.compile("[0-9]{4}.[0-1]?[0-9].[0-3]?[0-9]");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String dataUrodzeniaWczytana;
        do {
            System.out.print("Podaj datę urodzenia kota w formacie RRRR.MM.DD: ");
            dataUrodzeniaWczytana = getUserInput();
            if (wzorzecDaty.matcher(dataUrodzeniaWczytana).matches()) {
                try {
                    kot.setUrodzenie(sdf.parse(dataUrodzeniaWczytana));
                } catch (ParseException pe) {
                    System.out.println("Coś jest nie tak z datą! Przykładowa data: 2014.01.05");
                }
            }
        } while (kot.getUrodzenie()==null);

        Pattern wzorzecWagi = Pattern.compile("[0-9]+(\\.[0-9]+)?");
        String wagaWczytana;
        do {
            System.out.print("Podaj wagę kota: ");
            wagaWczytana = getUserInput();

            if (wzorzecWagi.matcher(wagaWczytana).matches()) {
                kot.setWaga(Float.valueOf(wagaWczytana));
            }
        } while (kot.getWaga() == null);

        System.out.println("Dziękuję, teraz już wiem prawie wszystko o kocie!");
        System.out.println(kot.przedstawSie());
    }


    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }

}