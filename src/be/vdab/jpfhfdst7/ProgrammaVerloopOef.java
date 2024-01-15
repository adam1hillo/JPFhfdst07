package be.vdab.jpfhfdst7;

import java.util.Scanner;

public class ProgrammaVerloopOef {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var dag = scanner.next();
        switch (dag) {
            case "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag" -> System.out.println("werkdag");
            case "zaterdag", "zondag" -> System.out.println("Weekend");
            default -> throw new IllegalArgumentException(dag + " bestaat niet");
        }
    }

}
