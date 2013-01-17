/**
 * Diese Klasse verwaltet die Artikel.
 * 
 * @author Lukas Klein <lukas.klein-q1j@rub.de>
 * @version 06.01.2013
 */

class UI {
    public UI() {
        Artikel diashow = new Artikel();
        diashow.setArtikelnummer(4711);
        diashow.setArtikelbezeichnung("Diashow");
        diashow.setKurzbeschreibung("Dia-Show auf HTML-Seite");
        diashow.setVerkaufspreis(29.9);

        Artikel bildbeschriftung = new Artikel();
        bildbeschriftung.setArtikelnummer(4712);
        bildbeschriftung.setArtikelbezeichnung("Bildbeschriftung");
        bildbeschriftung.setKurzbeschreibung("Erlaubt Beschriftung von Bildern");
        bildbeschriftung.setVerkaufspreis(99.9);

        Artikel piktos = new Artikel();
        piktos.setArtikelnummer(8726);
        piktos.setArtikelbezeichnung("100 Piktos");
        piktos.setKurzbeschreibung("100 Piktogramme für HTML-Seite");
        piktos.setVerkaufspreis(54.5);

        printHeader();
        printArticle(diashow);
        printArticle(bildbeschriftung);
        printArticle(piktos);
    }

    private void printHeader() {
        System.out.format("%15s %20s %10s %35s %20s", "Artikelnummer", "Artikelbezeichnung", "Sprache", "Kurzbeschreibung", "Verkaufspreis");
        System.out.println();
    }

    private void printArticle(Artikel article) {
        System.out.format("%15d %20s %10s %35s %20f", article.getArtikelnummer(), article.getArtikelbezeichnung(), article.getProgrammiersprache(), article.getKurzbeschreibung(), article.getVerkaufspreis());
        System.out.println();   
    }
}

public class Artikel {
    public int artikelnummer;
    public String artikelbezeichnung;
    public String programmiersprache = "Java";
    public String kurzbeschreibung;
    public double verkaufspreis = 0.0;

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int nummer) {
        artikelnummer = nummer;
    }

    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    public void setArtikelbezeichnung(String bezeichnung) {
        artikelbezeichnung = bezeichnung;
    }

    public String getProgrammiersprache() {
        return programmiersprache;
    }

    public void setProgrammiersprache(String sprache) {
        programmiersprache = sprache;
    }

    public String getKurzbeschreibung() {
        return kurzbeschreibung;
    }

    public void setKurzbeschreibung(String beschreibung) {
        kurzbeschreibung = beschreibung;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(double preis) {
        verkaufspreis = preis;
    }

    public static void main(String args[]) {
        new UI();
    }
}

/*
Ausgabe auf der Konsole:

Lukas-MacBook-Air:Uebung 7 lukas$ java Artikel
  Artikelnummer   Artikelbezeichnung    Sprache                    Kurzbeschreibung        Verkaufspreis
           4711              Diashow       Java             Dia-Show auf HTML-Seite            29.900000
           4712     Bildbeschriftung       Java    Erlaubt Beschriftung von Bildern            99.900000
           8726           100 Piktos       Java      100 Piktogramme für HTML-Seite            54.500000

*/