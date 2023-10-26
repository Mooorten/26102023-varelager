public class Main {
    public static void main(String[] args) {
        Vare v = new Vare(1,"Sko", 150, 250);
        /*System.out.println(v.getVareNavn()+" "+v.getVareNr());
        v.tilfoejAntal(25);
        System.out.println(v.getAntalPaaLager());*/

        //1. Opret et objekt af klassen VareLager
        VareLager vl1 = new VareLager();

        //2. Indsæt 10 varer i lageret. Vis både  anvendelse af
        vl1.indsaetVare(v);
        vl1.indsaetVare(2,"Skjorte", 400, 150);
        vl1.indsaetVare(3,"Bukser", 150, 99.50);
        vl1.indsaetVare(4,"Sokker", 125, 55);
        vl1.indsaetVare(5,"Kjole", 75, 300);
        vl1.indsaetVare(6,"Handske", 25, 299);
        vl1.indsaetVare(7,"Dame Skjorte", 40, 150);
        vl1.indsaetVare(8,"Shorts", 35, 175);
        vl1.indsaetVare(9,"Hue", 140, 125);
        vl1.indsaetVare(10,"Halstørklæde", 160, 175);


        //public void indsaetVare(int vNr, String vNavn, int antPaaLager, double stkPris) og
        //public void indsaetVare(Vare v)


        //3. Udskriv varelageret ved kald af funktionen
        // public static void udskrivLager(VareLager lager)
        udskrivLager(vl1);

        //4. Vis kald af metoden public void setNyPrisVare(int vNr,double nyPris)
        //Test herefter at metoden virker ved kald af funktionen udskrivLager
        vl1.setNyPrisVare(7, 199);
        udskrivLager(vl1);

        //5. Vis kald af metoden public void optaelAntal(int vNr,int antal)
        //Test herefter at metoden virker ved kald af funktionen udskrivLager
        vl1.optaelAntal(9, 60);
        udskrivLager(vl1);

        //6. Vis kald af metoden public void fjernAntal(int vNr,int antal)
        //Test herefter at metoden virker ved kald af funktionen udskrivLager
        vl1.fjernAntal(9,30);
        udskrivLager(vl1);

        //7. Vis kald af metoden public Vare hentVareOpl(int vNr)
        //Udskriv herefter vareoplysningerne på varen med dette varenummer vNr
        Vare v2 = vl1.hentVareOpl(6);
        System.out.println(v2);


        //8. Vis kald af metoden public Vare hentVareIndex(int index)
        //Udskriv herefter vareoplysningerne på vare med dette indexnummer i vareTabellen
        v2=vl1.hentVareIndex(0);
        System.out.println(v2);

        //9. Tilret opgave 2 så vareoplysningerne indlæses fra en tekstfil
        //For det første skal der oprettes en .txt fil med vareoplysninger
        //Herefter skal der implementeres en funktion public static void indlaesFraFil(VareLager lager)
        //som kan indlæse data fra .txt filen i varelageret lager
        //Vis kald af denne funktionen og udskriv herefter varelageret

        //10. Implementer en funktion public static void udskrivTilFil(VareLager lager)
        //Ved kald af funktionen skal alle vareoplysningerne udskrives til en .txt fil

    }

    public static void udskrivLager(VareLager lager){
        for(int i=0;i<lager.getAntVarer();i++){
            Vare v=lager.hentVareIndex(i);
            System.out.println(v.getVareNr()+" "+v.getVareNavn()+" "+v.getAntalPaaLager()+" "+v.getStkPris());
        }
    }
}
