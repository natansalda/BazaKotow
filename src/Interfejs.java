import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Interfejs {

    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Kot kot = new Kot();

        System.out.print("Podaj imię kota: ");
        kot.setImie(getUserInput());

        System.out.print("Podaj, kto jest opiekunem kota: ");
        kot.setImieOpiekuna(getUserInput());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        do {
            System.out.print("Podaj datę urodzenia kota w formacie RRRR.MM.DD: ");
            try {
                kot.setUrodzenie(sdf.parse(getUserInput()));
            } catch (ParseException pe) {
                System.out.println("Coś jest nie tak z formatem daty! Przykładowa data: 2014.01.05");
            }
        } while (kot.getUrodzenie() == null);

        do {
            System.out.print("Podaj wagę kota: ");
            try {
                kot.setWaga(Float.valueOf(getUserInput()));
            } catch (NumberFormatException nfe) {
                System.out.println("Coś jest nie tak z formatem wagi! Przykładowa waga: 10.0");
            }
        } while (kot.getWaga() == null);

        System.out.println("Dziękuję, teraz już wiem prawie wszystko o kocie!");
        System.out.println(kot.przedstawSie());
    }


    public static String getUserInput() {
        return inputScanner.nextLine().trim();
    }

}