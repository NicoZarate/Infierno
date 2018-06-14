package Infierno;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String arg[] ){
        Diablo diablo = new Diablo();
        Fuego df1 = new Fuego(20);
        Fuego df2 = new Fuego(20);
        Hielo dh1 = new Hielo(25);
        Sombra ds1 = new Sombra(20,50);
        Alma a1=new Alma(20,22);
        Alma a2=new Alma(20,25);
        Alma a3=new Alma(20,23);
        Lugar l1 = new Lugar("esmeralda");
        l1.getAlmas().add(a1);
        l1.getAlmas().add(a2);
        l1.getAlmas().add(a3);
        diablo.getDemonios().add(df1);
        diablo.getDemonios().add(df2);
        diablo.getDemonios().add(dh1);
        diablo.getDemonios().add(ds1);
/*
        System.out.println("-------punto 1 saber si un demonio puede cazar(que no sea jodida)-------");
        System.out.println("tipo fuego m: 20 contra alma 18 daria que no es jodida ");
        System.out.println(df1.esJodida(a1));
        System.out.println("y no friolenta");
        System.out.println(a1.isFriolento());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("tipo hielo m: 25 contra alma 18 daria que no es jodida ");
        a1.cambiarEstado();
        System.out.println(dh1.esJodida(a1));
        System.out.println("y es friolenta");
        System.out.println(a1.isFriolento());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("tipo sombra m: 20 contra alma 18 daria que no es jodida ");
        System.out.println(ds1.esJodida(a1));
        System.out.println("y es friolenta");
        System.out.println(a1.isFriolento());
        System.out.println("----------------------------------------------------------------------");
        System.out.println("tipo hielo m: 20 contra alma 23 daria que  es jodida ");
        System.out.println(df1.esJodida(a3));
        System.out.println("y es friolenta");
        System.out.println(a1.isFriolento());
        System.out.println("-------punto 2 saber si un demonio puede atormentar un alma en particular " +
                          "(que no sea jodida)-------");
        df1.atormentarAlma(a3);
        System.out.println("tipo fuego m: 20 contra alma 23 ,la atormenta y la deja no friolenta ");
        System.out.println(a3.isFriolento());
        System.out.println(df1.getAlmasAtormentadas());
        dh1.atormentarAlma(a3);
        System.out.println("tipo hielo m: 20 contra alma 23 ,la atormenta y la deja  friolenta ");
        System.out.println(a3.isFriolento());
        System.out.println(df1.getAlmasAtormentadas());

        System.out.println("saber cuales son casables para un demonio en un lugar");

        for (Alma alma: df1.cazablesPorMi(l1)) {
            System.out.println(alma.toString());
        }

        System.out.println("que un demonio salga a cazar a un lugar determinado");
        System.out.println(df1.cazar(l1));

        for (Alma alma: l1.getAlmas()) {
            System.out.println(alma.toString());
        }
        */
       System.out.println("si un demonio puede hacer la mision safari con mas 20%");
       Safari s1 = new Safari(l1,20.0);
       System.out.println(s1.puedeHacerMision(df1));


    }
}