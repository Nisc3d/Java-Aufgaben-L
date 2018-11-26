package Aufgabe5;

import java.util.StringTokenizer;

public class nr3 {
    public static void main(String[] args) {
        Object[] liste = new Object[8];
        String s = "2012-12-06 14:21:46.157";
        StringTokenizer st = new StringTokenizer(s, "- :.");
        int i = 1;
        while (st.hasMoreElements()) {
            liste[i] = st.nextElement();
            i += 1;
        }
        System.out.println(liste[3] + "." + liste[2] + "." + liste[1] + ", Uhrzeit: " + liste[4] + ":" + liste[5] + ", " + liste[6] + " Sekunden " + liste[7] + " Millisekunden");



//        Umständliche Methode:
        int jahr = Integer.parseInt(s.substring(0, 4));
        int monat = Integer.parseInt((s.substring(5, 7)));
        int tag = Integer.parseInt((s.substring(8, 10)));
        int stunden = Integer.parseInt((s.substring(11, 13)));
        int minuten = Integer.parseInt((s.substring(14, 16)));
        int sekunden = Integer.parseInt((s.substring(17, 19)));
        int msekunden = Integer.parseInt((s.substring(20, 23)));

        System.out.println(Integer.toString(tag) + "." + Integer.toString(monat) + "." + Integer.toString(jahr) + ", Uhrzeit: " + Integer.toString(stunden) + ":" + Integer.toString(minuten) + ", " + Integer.toString(sekunden) + " Sekunden " + Integer.toString(msekunden) + " Millisekunden");

    }
}
