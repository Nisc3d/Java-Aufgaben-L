package Aufgabe5;

public class nr4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        int zahl = 0;
        int stelle = 0;
        while (zahl < 300){
            zahl = zahl + stelle;
            sb.append(zahl + ", ");
            stelle += 1;
        }

        sb.deleteCharAt(sb.length()-2);
        System.out.println(sb.toString());
    }
}
