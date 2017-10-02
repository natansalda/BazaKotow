import java.util.Date;

public class Kot {

    private static String imie = "Ruby";
    private static Date urodzenie = null;
    private static Float waga = null;
    private static String imieOpiekuna = "Natalia";

    public static String przedstawSie() {
        return "Cześć, jestem " + imie + ", urodziłam się " + urodzenie + ", ważę " + waga + "kg, a opiekuje się mną " + imieOpiekuna;

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getUrodzenie() {
        return urodzenie;
    }

    public void setUrodzenie(Date urodzenie) {
        this.urodzenie = urodzenie;
    }

    public Float getWaga() {
        return waga;
    }

    public void setWaga(Float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

}
