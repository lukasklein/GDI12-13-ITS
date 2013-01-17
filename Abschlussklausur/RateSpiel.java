import inout.Console;

public class RateSpiel {
    public static void main(String args[]) {
        System.out.println("Lass uns ein Spiel spielen. Du denkst dir jetzt eine Zahl zwischen 1 und 50 aus und ich werde dir Fragen stellen.");
        int found10 = find10();
        if (found10 < 0) { // Error, abort
            return;
        }
        int found1 = find1();
        if (found1 < 0) { // Error, abort
            return;
        }
        // Calculate the solution
        int solution = found10 * 10 + found1;
        System.out.println("Die Loesung lautet " + solution + "!");
    }

    private static int find10() {
        for(int i = 0; i < 6; i++) { // from 0 to 5
            System.out.print("Ist die Zehnerziffer = " + i + "? (true/false): ");
            if(Console.readBoolean()) { // If found, return
                return i;
            }
        }
        // Now we have a problem...
        System.out.println("Es gibt keine Loesung! Deine ausgedachte Zahl liegt nicht zwischen 1 und 50!");
        return -1; // Error-code
    }

    private static int find1() {
        for(int i = 0; i < 10; i++) { // from 0 to 9
            System.out.print("Ist die Einerziffer = " + i + "? (true/false): ");
            if(Console.readBoolean()) { // If found, return
                return i;
            }
        }
        // Now we have another problem...
        System.out.println("Es gibt keine Loesung! Deine ausgedachte Zahl liegt nicht zwischen 1 und 50!");
        return -1; // Error-code
    }
}

/* Ausgabe auf der Konsole (die ausgedachte Zahl war 42):
noname:Abschlussklausur lukas$ java RateSpiel
Lass uns ein Spiel spielen. Du denkst dir jetzt eine Zahl zwischen 1 und 50 aus und ich werde dir Fragen stellen.
Ist die Zehnerziffer = 0? (true/false): false
Ist die Zehnerziffer = 1? (true/false): false
Ist die Zehnerziffer = 2? (true/false): false
Ist die Zehnerziffer = 3? (true/false): false
Ist die Zehnerziffer = 4? (true/false): true
Ist die Einerziffer = 0? (true/false): false
Ist die Einerziffer = 1? (true/false): false
Ist die Einerziffer = 2? (true/false): true
Die Loesung lautet 42!
*/