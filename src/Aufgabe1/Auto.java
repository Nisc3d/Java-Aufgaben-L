package Aufgabe1;

public class Auto {
    String marke;
    int seriennummer, anzahl_ps, anzahl_sitz;

    public Auto(String marke, int seriennummer, int anzahl_ps, int anzahl_sitz){
        this.marke = marke;
        this.seriennummer = seriennummer;
        this.anzahl_ps = anzahl_ps;
        this.anzahl_sitz = anzahl_sitz;
    }

    public void printAutoInfo(){
        System.out.println("Marke: " + marke);
        System.out.println("Seriennummer: " + seriennummer);
        System.out.println("Anzahl PS: " + anzahl_ps);
        System.out.println("Anzahl Sitzplätze: " + anzahl_sitz);
    }
}
