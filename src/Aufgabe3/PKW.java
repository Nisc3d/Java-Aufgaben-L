package Aufgabe3;

public class PKW extends Kraftfahrzeug {
    int anzSitze;
    PKW(int anzPs, String marke, double tankGroesse, double fuellstand, int anzSitze) {
        super(anzPs, marke, tankGroesse, fuellstand);
        this.anzSitze = anzSitze;
    }

    void ausgeben(){
        System.out.println("Marke:" + getMarke() + " ps:" + getAnzPs() + " sitze:" + anzSitze);
    }
}

