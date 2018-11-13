package Aufgabe3;

public class Test {
    public static void main(String[] args) {
        PKW pkw_vw =  new PKW(211, "vw", 4,0, 5);
        LKW lkw_daimler = new LKW(500, "Daimler", 10,0,30);
        Motorrad motorrad_bmw = new Motorrad(100,"BMW", 3, 0);

        Kraftfahrzeug[] meineKFZ = new Kraftfahrzeug[3];
        meineKFZ[0] = pkw_vw;
        meineKFZ[1] = lkw_daimler;
        meineKFZ[2] = motorrad_bmw;

        meineKFZ[0].tanken(30);
        meineKFZ[0].fahren(2);


        for (int i = 0; i < meineKFZ.length; i++) {
            meineKFZ[i].ausgeben();
        }

    }
}
