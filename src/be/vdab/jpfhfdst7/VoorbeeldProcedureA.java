package be.vdab.jpfhfdst7;

import java.util.Arrays;

public class VoorbeeldProcedureA {
    public static void main(String[] args) {
        var getallen = new int[50];

        for (var i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * 1000 + 1);
        }
        System.out.println("Ongesorteerd");
        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
        System.out.println("");
        Arrays.sort(getallen);

        System.out.println("Gesorteerd");
        for (var getal : getallen) {
            System.out.print(getal + "\t");
        }
    }
}
