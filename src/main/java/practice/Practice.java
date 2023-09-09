package practice;

import practice.entidades.*;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Alimento> alimentos = new ArrayList<>();

        alimentos.add(new Alimento("Alimento",false));
        alimentos.add(new Fruta("Fresa",true,false));
        alimentos.add(new Verdura("Zanahoria",true,false,true));
        alimentos.add(new Carne("Carne",false,"Animal"));
        alimentos.add(new Pescado("Atun", false,"Animal",false,true,true));
        alimentos.add(new Res("Res",false,"Animal",true,true,true));


        for (Alimento alimento : alimentos) {

            /**
             *  Se puede castear el mas chico al mas grande
             */
/*
            Alimento carnes = alimento instanceof Carne ? ((Carne) alimento) : null;

            if (carnes!=null) System.out.println(carnes);

 */
            if (alimento instanceof Blanca) System.out.println(alimento);
            
        }

    }
}
