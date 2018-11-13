package Aufgabe3;

public class Kraftfahrzeug implements BetankbaresFahrzeug, Fahrzeug{
    private int anzPs;
    private String marke;
    private double tankGroesse;
    private double fuellstand;

    public int getAnzPs() {
        return anzPs;
    }

    public void setAnzPs(int anzPs) {
        this.anzPs = anzPs;
    }

    public String getMarke() {
        return marke;
    }

    Kraftfahrzeug(int anzPs, String marke, double tankGroesse, double fuellstand){
        this.anzPs = anzPs;
        this.marke = marke;
        this.tankGroesse = tankGroesse;
        this.fuellstand = fuellstand;
    }

    void ausgeben(){
        System.out.println("Marke:" + marke + " ps:" + anzPs);
    }

    public void tanken(int liter){
        if (fuellstand + liter <= tankGroesse) {
            fuellstand = fuellstand + liter;
            System.out.println(liter + " liter getankt.");
        }
        else {
            fuellstand = tankGroesse;
            System.out.println("Tank vollgetankt.");
        }
    }

    public void fahren(int streckeKm){
        if (fuellstand < streckeKm){
            System.out.println("Tank reicht nicht");
        }
        else {
            System.out.println(streckeKm + " km gefahren");
        }
    }
}