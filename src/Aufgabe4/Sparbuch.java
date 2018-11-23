package Aufgabe4;

public class Sparbuch {
    private double kontostand = 0, zinssatzProzent = 0;
    private int kontonummer;
    private static int counter = 1000000;
    private String besitzer;
    private boolean aufgeloest;

    Sparbuch(String besitzer) {
        kontonummer = counter += 1;
        this.besitzer = besitzer;
        aufgeloest = false;
    }

    public void setZinssatzProzent(int zinssatzProzent) throws KontoExistiertNichtException {
        this.zinssatzProzent = zinssatzProzent;
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
    }

    public int getKontonummer() throws KontoExistiertNichtException {
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
        else {
            return kontonummer;
        }
    }

    public double getZinssatzProzent() throws KontoExistiertNichtException {
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
        else {
            return zinssatzProzent;
        }
    }

    public String getBesitzer() throws KontoExistiertNichtException {
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
        else {
            return besitzer;
        }
    }

    public double getKontostand() throws KontoExistiertNichtException {
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
        else {
            return kontostand;
        }
    }


    void einzahlen(int eur) throws KontoExistiertNichtException {
        kontostand = kontostand + (double) eur;
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
    }

    void abheben(int eur) throws KontostandException, KontoExistiertNichtException {
        if (kontostand - eur >= 0) {
            kontostand = kontostand -= (double) eur;
        }
        else {
            throw new KontostandException("Nicht genug Geld auf Konto");
        }

        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }

    }

    void auflösen() throws KontoExistiertNichtException {
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
        aufgeloest = true;
    }

    void verzinsen() throws KontoExistiertNichtException {
        kontostand = kontostand * (1 + (zinssatzProzent / 100));
        if (aufgeloest == true) {
            throw new KontoExistiertNichtException("Konto existiert nicht!");
        }
    }
}
