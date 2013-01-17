/*********************************************
Programm zur Verwaltung von CDs.


Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 16/12/12
*********************************************/

public class CDCollection {
    private static String cds[][] = new String[0][2];
    public static void main(String args[]) {
        // Demo
        addCD("Never Gonna Give You Up", "Rick Astley"); // :P
        addCD("LaLeLu", "Rolf Zuckowski"); // Lukas
        addCD("Hoch auf der Alm", "Kastelruther Spatzen"); // Klein

        System.out.println("Output all CDs");
        printAllCDs();
        System.out.println();
        System.out.println("Output the search results for Rick Astley");
        printCDs(findCD("", "Rick Astley"));
        System.out.println();
        System.out.println("Remove all titles that contain Never and output");
        removeCD(findCD("Never", "")[0]);
        printAllCDs();
    }

    public static int addCD(String title, String artist) {
        String cdsOld[][] = cds;
        cds = new String[cds.length + 1][2]; // initialize new cds array with size oldlength + 1
        for(int i = 0; i < cdsOld.length; i++) { // copy the old data over
            cds[i] = cdsOld[i];
        }
        // Append the new data
        cds[cds.length - 1][0] = title;
        cds[cds.length - 1][1] = artist;
        return cds.length - 1; // Return the index
    }

    public static void removeCD(int index) {
        String newCDs[][] = new String[cds.length - 1][2]; // initialize new cds array with oldlength - 1
        for(int i = 0; i < index; i++) { // copy everything from 0 to index
            newCDs[i] = cds[i];
        }
        for(int i = index + 1; i < cds.length; i++) { // copy everything from index + 1 to end
            newCDs[i - 1] = cds[i];
        }
        cds = newCDs;
    }

    public static int[] findCD(String title, String artist) {
        int result[] = new int[cds.length];
        int resultCount = 0;
        for(int i = 0; i < cds.length; i++) {
            if(cds[i][0].contains(title) && cds[i][1].contains(artist)) { // search criteria
                result[resultCount] = i; // save index to the result set
                resultCount++;
            }
        }
        // Strip the result array
        int resultTemp[] = result;
        result = new int[resultCount];
        for(int i = 0; i < resultCount; i++) {
            result[i] = resultTemp[i];
        }
        return result;
    }

    public static void printCD(int index) {
        System.out.println(cds[index][0] + " by " + cds[index][1]);
    }

    public static void printCDs(int indexes[]) {
        for(int i = 0; i < indexes.length; i++) {
            printCD(indexes[i]);
        }
    }

    public static void printAllCDs() {
        for(int i = 0; i < cds.length; i++) {
            printCD(i);
        }
    }
}

/* Ausgabe auf der Konsole
lukas@ubuntu:~/Uni/1$ java CDCollection 
Output all CDs
Never Gonna Give You Up by Rick Astley
LaLeLu by Rolf Zuckowski
Hoch auf der Alm by Kastelruther Spatzen

Output the search results for Rick Astley
Never Gonna Give You Up by Rick Astley

Remove all titles that contain Never and output
LaLeLu by Rolf Zuckowski
Hoch auf der Alm by Kastelruther Spatzen

*/