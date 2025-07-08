package com.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainDecimal {
    public static void main(String[] args) {
/*
MÉTHOD 1
parámetro de BigD
            --> que devuelva un double del BigD
            --> tiene que tener sólo dos decimales

MÉTHOD 2
parámetro de BigD
            --> que devuelva el BigD con el signo contrario
            --> tiene que tener sólo un decimal

 */
        BigDecimal bg1 = new BigDecimal("-5.65264684654");

        System.out.println(bigD1(bg1));
        System.out.println(bigD2(bg1));


    }
    public static double bigD1(BigDecimal bd1){

        return bd1.setScale(2, RoundingMode.CEILING).doubleValue();
    }

//    IMPORTANTE recuerda QUE TIENES QUE EXPLICARLE QUÉ
//    ES LO QUE QUIERES QUE TE DEVUELVA EN EL MÉTHOD
//    Y QUE EL NOMBRE QUE LE PONGAS AL PARÁMETRO ES UN POCO ALEATORIO PERO TIENES
//    QUE ESPECIFICAR EL QUÉ por dios QUE LUEGO TE ESTRESAS de la nada

    public static BigDecimal bigD2(BigDecimal bd2){

        return bd2.setScale(1, RoundingMode.CEILING).negate();
    }
}
