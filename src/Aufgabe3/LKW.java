package Aufgabe3;

public class LKW extends Kraftfahrzeug {
    int lastTonnen;

    LKW(int anzPs, String marke, double tankGroesse, double fuellstand, int lastTonnen) {
        super(anzPs, marke, tankGroesse, fuellstand);
        this.lastTonnen = lastTonnen;
    }
    void ausgeben(){
        super.ausgeben();
        System.out.println(getAnzPs() + "max. last:" + lastTonnen);
    }
}
