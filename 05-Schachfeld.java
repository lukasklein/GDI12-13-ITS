/*********************************************
Programm zur Loesung des Schachfeldproblems
von Sessa Ebn. Zur genauen Beschreibung des
Problems siehe
http://www.schachfeld.de/f155/weizenkorn-geschichte-4837/


Author: Lukas Klein <lukas.klein-q1j@rub.de>
Date: 04/12/12
*********************************************/

import java.math.BigInteger;

public class Schachbrett {
    public static void main(String args[]) {
        int count = 64;
        BigInteger koerner = BigInteger.valueOf(1);
        System.out.println("Schachfeldzaehler\tKoerner\t\t\t\tSumme der Koerner");
        for(int i = 1; i < count; i++) {
            String currentKoerner = pad(koerner.multiply(BigInteger.valueOf(2)), 31); // Padding mit 31, da dies die Stellenanzahl ist
            String totalKoerner = pad(koerner.add(koerner.multiply(BigInteger.valueOf(2))), 31); // Hier auch
            System.out.println((i+1) + "\t\t\t" + currentKoerner + "\t" + totalKoerner);
            koerner = koerner.add(koerner.multiply(BigInteger.valueOf(2))); // Die Koerneranzahl updaten
        }
    }

    private static String pad(BigInteger num, int count) { // Funktion zum Padding eines BigIntegers
        int length = num.toString().length();
        String result = "";
        for(int i = 0; i < count-length; i++) { // gewuenschte Anzahl - tatsaechliche Anzahl 0en einfuegen
            result = result + "0";
        }
        result = result + num.toString();
        return result;
    }
}

/*
(a) n = 31

(b) Nein, da ein Long nur maximal einen Wert von 2**63-1 = 9223372036854775807 speichern kann. Dies waere,
selbst wenn Java unsigned Datentypen unterstuetzen wuerde, viel zu wenig.

(c) Dies waere der BigInteger. Warum er hier nicht verwendet wird erschliesst sich mir nicht, schliesslich
verwende ich ihn. (?!)

Ausgabe auf der Konsole:

lukas@ubuntu:~/Uni/1$ java Schachbrett 
Schachfeldzaehler   Koerner                         Summe der Koerner
2                   0000000000000000000000000000002 0000000000000000000000000000003
3                   0000000000000000000000000000006 0000000000000000000000000000009
4                   0000000000000000000000000000018 0000000000000000000000000000027
5                   0000000000000000000000000000054 0000000000000000000000000000081
6                   0000000000000000000000000000162 0000000000000000000000000000243
7                   0000000000000000000000000000486 0000000000000000000000000000729
8                   0000000000000000000000000001458 0000000000000000000000000002187
9                   0000000000000000000000000004374 0000000000000000000000000006561
10                  0000000000000000000000000013122 0000000000000000000000000019683
11                  0000000000000000000000000039366 0000000000000000000000000059049
12                  0000000000000000000000000118098 0000000000000000000000000177147
13                  0000000000000000000000000354294 0000000000000000000000000531441
14                  0000000000000000000000001062882 0000000000000000000000001594323
15                  0000000000000000000000003188646 0000000000000000000000004782969
16                  0000000000000000000000009565938 0000000000000000000000014348907
17                  0000000000000000000000028697814 0000000000000000000000043046721
18                  0000000000000000000000086093442 0000000000000000000000129140163
19                  0000000000000000000000258280326 0000000000000000000000387420489
20                  0000000000000000000000774840978 0000000000000000000001162261467
21                  0000000000000000000002324522934 0000000000000000000003486784401
22                  0000000000000000000006973568802 0000000000000000000010460353203
23                  0000000000000000000020920706406 0000000000000000000031381059609
24                  0000000000000000000062762119218 0000000000000000000094143178827
25                  0000000000000000000188286357654 0000000000000000000282429536481
26                  0000000000000000000564859072962 0000000000000000000847288609443
27                  0000000000000000001694577218886 0000000000000000002541865828329
28                  0000000000000000005083731656658 0000000000000000007625597484987
29                  0000000000000000015251194969974 0000000000000000022876792454961
30                  0000000000000000045753584909922 0000000000000000068630377364883
31                  0000000000000000137260754729766 0000000000000000205891132094649
32                  0000000000000000411782264189298 0000000000000000617673396283947
33                  0000000000000001235346792567894 0000000000000001853020188851841
34                  0000000000000003706040377703682 0000000000000005559060566555523
35                  0000000000000011118121133111046 0000000000000016677181699666569
36                  0000000000000033354363399333138 0000000000000050031545098999707
37                  0000000000000100063090197999414 0000000000000150094635296999121
38                  0000000000000300189270593998242 0000000000000450283905890997363
39                  0000000000000900567811781994726 0000000000001350851717672992089
40                  0000000000002701703435345984178 0000000000004052555153018976267
41                  0000000000008105110306037952534 0000000000012157665459056928801
42                  0000000000024315330918113857602 0000000000036472996377170786403
43                  0000000000072945992754341572806 0000000000109418989131512359209
44                  0000000000218837978263024718418 0000000000328256967394537077627
45                  0000000000656513934789074155254 0000000000984770902183611232881
46                  0000000001969541804367222465762 0000000002954312706550833698643
47                  0000000005908625413101667397286 0000000008862938119652501095929
48                  0000000017725876239305002191858 0000000026588814358957503287787
49                  0000000053177628717915006575574 0000000079766443076872509863361
50                  0000000159532886153745019726722 0000000239299329230617529590083
51                  0000000478598658461235059180166 0000000717897987691852588770249
52                  0000001435795975383705177540498 0000002153693963075557766310747
53                  0000004307387926151115532621494 0000006461081889226673298932241
54                  0000012922163778453346597864482 0000019383245667680019896796723
55                  0000038766491335360039793593446 0000058149737003040059690390169
56                  0000116299474006080119380780338 0000174449211009120179071170507
57                  0000348898422018240358142341014 0000523347633027360537213511521
58                  0001046695266054721074427023042 0001570042899082081611640534563
59                  0003140085798164163223281069126 0004710128697246244834921603689
60                  0009420257394492489669843207378 0014130386091738734504764811067
61                  0028260772183477469009529622134 0042391158275216203514294433201
62                  0084782316550432407028588866402 0127173474825648610542883299603
63                  0254346949651297221085766599206 0381520424476945831628649898809
64                  0763040848953891663257299797618 1144561273430837494885949696427
*/