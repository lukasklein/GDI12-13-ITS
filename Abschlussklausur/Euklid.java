public class Euklid {
    public static void main(String args[]) {
        int solution = euklid(42, 1337);
        System.out.println("Der ggT von 42 und 1337 ist " + solution);
    }

    private static int euklid(int m, int n) {
        if(m < n) { // Swap m and n
            int m_ = m;
            m = n;
            n = m_;
        }
        int r = m - n;
        m = n;
        n = r;
        if(r != 0) { // If r != 0, call yourself
            return euklid(m, n);
        }
        // Else we have found the solution and can return it
        return m;
    }
}

/* Ausgabe auf der Konsole:
noname:Abschlussklausur lukas$ java Euklid
Der ggT von 42 und 1337 ist 7
*/