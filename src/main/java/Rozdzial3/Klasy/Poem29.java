package Rozdzial3.Klasy;

import SpringComponentTest.Poem;

public class Poem29 implements Poem {
    private static String[] lines = {
            "Gdy los i ludzie częstują mnie wzgardą, ",
            "Chcę miłosierdzie wzbudzić w głuchym niebie; ",
            "Płaczę i żalę się na dolę twardą, ",
            "I klnę upadek mój patrząc na siebie. ",
            "Chcę mieć bogatszą nadzieję przyszłości, ",
            "Mieć rysy innych i przyjaciół rzeszę, ",
            "Dobra jednego, innego zdolności, ",
            "Gdyż tym, co moje, zgoła się nie cieszę. ",
            "Lecz gdy od myśli tych brzydnie mi życie, ",
            "Wraca o tobie myśl, a moja dusza ",
            "Niby skowronek zrywa się o świcie",
            "I hymn podnosząc, bramy niebios wzrusza; ",
            "Gdyż twej miłości najsłodsze wspomnienie ",
            "Sprawia, że z królem losu nie zamienię."
    };

    public Poem29(){

    }

    public void recite(){
        for(int i=0; i<lines.length; i++){
            System.out.println(lines[i]);
        }
    }
}
