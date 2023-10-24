import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Opgave 1
        System.out.println("OPGAVE 1");
        Vare v1 = new Vare(1, "Cookie", 200,2.2 );
        System.out.println(v1);

        //Opgave 2
        System.out.println("OPGAVE 2");
        v1.Tilfoej(10);
        System.out.println(v1);

        //Opgave 3
        System.out.println("OPGAVE 3");
        v1.fjernVare(20);
        System.out.println(v1);

        //Opgave 4
        System.out.println("OPGAVE 4");
        v1.plusVare(10);
        System.out.println(v1);

        //Opgvae 5
        System.out.println("OPGAVE 5");
        v1.nyPris(2);
        System.out.println(v1);

        //Opgave 6
        System.out.println("OPGAVE 6");
        double indkoebsPris = v1.rabat(22);
        System.out.println(indkoebsPris);

        //Opgave 7 & 8
        Vare [] vareTabel=new Vare[10];
        vareTabel[0] = new Vare(1, "Brød", 100, 15);
        vareTabel[1] = new Vare(2,"Mælk", 50, 14);
        vareTabel[2] = new Vare(3,"Æg", 300, 8);
        vareTabel[3] = new Vare(4,"Smør", 80, 11);
        vareTabel[4] = new Vare(5,"Yoghurt", 20,20);
        for(int i = 0 ; i < 5; i++){
            System.out.println(vareTabel[i]);
        }

        //Opgave 9
        Vare lowestPriceVare = vareTabel[0];
        for (int i = 1; i < 5; i++) {
            if (vareTabel[i].getStkPris() < lowestPriceVare.getStkPris()) {
                lowestPriceVare = vareTabel[i];
            }
        }
        System.out.println("Vare with the lowest stkPris: " + lowestPriceVare);

        //Opgave 10
        vareTabel[4].nyPris(15);
        System.out.println(vareTabel[4]);

    }
}