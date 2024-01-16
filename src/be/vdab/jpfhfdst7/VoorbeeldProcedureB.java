package be.vdab.jpfhfdst7;

import java.util.Arrays;

public class VoorbeeldProcedureB {
    public static void main(String[] args) {

        var getallen = new int[50];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 +1);
        }
        toonTabel(getallen, "Ongesorteerd");

        Arrays.sort(getallen);

        toonTabel((getallen), "Gesorteerd");

    }

    private static void toonTabel(int[] teTonenTabel, String titel) {
        System.out.println("\n" + titel);
        for (var getal : teTonenTabel) {
            System.out.print(getal + "\t");
        }
    }
}
