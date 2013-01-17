public class OptiTravelCRM {
    static String clients[][] = new String[5][4]; // Use a class-global variable so there's no need to pass the array around between functions
    public static void main(String args[]) {
        // Setup the initial client data
        clients[0][0] = "0";
        clients[0][1] = "Klein";
        clients[0][2] = "Lukas";
        clients[0][3] = "Bottrop";

        clients[1][0] = "1";
        clients[1][1] = "Gross";
        clients[1][2] = "Sakul";
        clients[1][3] = "Porttob";

        clients[2][0] = "2";
        clients[2][1] = "Peter";
        clients[2][2] = "Heidi";
        clients[2][3] = "Almdorf";

        clients[3][0] = "3";
        clients[3][1] = "Loser";
        clients[3][2] = "Obdach";
        clients[3][3] = "----";

        clients[4][0] = "4";
        clients[4][1] = "Mueller";
        clients[4][2] = "Maik";
        clients[4][3] = "Muehlenstadt";

        // Testrun
        System.out.println("Unsorted:");
        outputClients();

        System.out.println("Sorted by Customer ID (ascending):");
        sortClients(0, "asc");
        outputClients();

        System.out.println("Sorted by Customer ID (descending):");
        sortClients(0, "desc");
        outputClients();

        System.out.println("Sorted by Name (ascending):");
        sortClients(1, "asc");
        outputClients();

        System.out.println("Sorted by Name (descending):");
        sortClients(1, "desc");
        outputClients();

        System.out.println("Sorted by First Name (ascending):");
        sortClients(2, "asc");
        outputClients();

        System.out.println("Sorted by First Name (descending):");
        sortClients(2, "desc");
        outputClients();

        System.out.println("Sorted by Place (ascending):");
        sortClients(3, "asc");
        outputClients();

        System.out.println("Sorted by Place (descending):");
        sortClients(3, "desc");
        outputClients();

        System.out.println();
        System.out.println("Searching for myself:");
        findClient("kle");
    }

    private static String[][] sortClients(int sortIndex, String ordering) { // ordering must be "asc" (or "desc", doesn't really matter)
        int swap, compare;
        String temp[] = new String[4]; // used to swap the datasets
        for(int pos = 0; pos < clients.length; pos++) {
            swap = pos;
            for(int iter = pos; iter < clients.length; iter++) {
                compare = clients[swap][sortIndex].compareTo(clients[iter][sortIndex]); // compare the two datasets
                if(ordering.equals("asc")) {
                    if(compare > 0) { // If the ordering is ascending and the first field is smaller than the one we're comparing with, use this as the new to-swap-with-element
                        swap = iter;
                    }
                } else {
                    if(compare < 0) {
                        swap = iter;
                    }
                }
            }
            // Swap the two datasets (if equal clients will not change)
            temp = clients[pos];
            clients[pos] = clients[swap];
            clients[swap] = temp;
        }
        return clients;
    }

    private static void findClient(String name) {
        for(int i = 0; i < clients.length; i++) {
            if(clients[i][1].toLowerCase().contains(name.toLowerCase())) { // Case-insensitive search
                System.out.println("ID:\t\t" + clients[i][0]);
                System.out.println("Name:\t\t" + clients[i][1]);
                System.out.println("First Name:\t" + clients[i][2]);
                System.out.println("Place:\t\t" + clients[i][3]);
            }
        }
    }

    private static void outputClients() {
        System.out.println("ID\tName\tVorname\tOrt");
        for(int i = 0; i < clients.length; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(clients[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


/* Ausgabe auf der Konsole:

lukas@ubuntu:~/Uni/1$ java OptiTravelCRM 
Unsorted:
ID  Name    Vorname Ort
0   Klein   Lukas   Bottrop 
1   Gross   Sakul   Porttob 
2   Peter   Heidi   Almdorf 
3   Loser   Obdach  ----    
4   Mueller Maik    Muehlenstadt    
Sorted by Customer ID (ascending):
ID  Name    Vorname Ort
0   Klein   Lukas   Bottrop 
1   Gross   Sakul   Porttob 
2   Peter   Heidi   Almdorf 
3   Loser   Obdach  ----    
4   Mueller Maik    Muehlenstadt    
Sorted by Customer ID (descending):
ID  Name    Vorname Ort
4   Mueller Maik    Muehlenstadt    
3   Loser   Obdach  ----    
2   Peter   Heidi   Almdorf 
1   Gross   Sakul   Porttob 
0   Klein   Lukas   Bottrop 
Sorted by Name (ascending):
ID  Name    Vorname Ort
1   Gross   Sakul   Porttob 
0   Klein   Lukas   Bottrop 
3   Loser   Obdach  ----    
4   Mueller Maik    Muehlenstadt    
2   Peter   Heidi   Almdorf 
Sorted by Name (descending):
ID  Name    Vorname Ort
2   Peter   Heidi   Almdorf 
4   Mueller Maik    Muehlenstadt    
3   Loser   Obdach  ----    
0   Klein   Lukas   Bottrop 
1   Gross   Sakul   Porttob 
Sorted by First Name (ascending):
ID  Name    Vorname Ort
2   Peter   Heidi   Almdorf 
0   Klein   Lukas   Bottrop 
4   Mueller Maik    Muehlenstadt    
3   Loser   Obdach  ----    
1   Gross   Sakul   Porttob 
Sorted by First Name (descending):
ID  Name    Vorname Ort
1   Gross   Sakul   Porttob 
3   Loser   Obdach  ----    
4   Mueller Maik    Muehlenstadt    
0   Klein   Lukas   Bottrop 
2   Peter   Heidi   Almdorf 
Sorted by Place (ascending):
ID  Name    Vorname Ort
3   Loser   Obdach  ----    
2   Peter   Heidi   Almdorf 
0   Klein   Lukas   Bottrop 
4   Mueller Maik    Muehlenstadt    
1   Gross   Sakul   Porttob 
Sorted by Place (descending):
ID  Name    Vorname Ort
1   Gross   Sakul   Porttob 
4   Mueller Maik    Muehlenstadt    
0   Klein   Lukas   Bottrop 
2   Peter   Heidi   Almdorf 
3   Loser   Obdach  ----    

Searching for myself:
ID:         0
Name:       Klein
First Name: Lukas
Place:      Bottrop
*/