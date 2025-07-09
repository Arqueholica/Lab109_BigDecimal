package com.Interfaces;
import java.util.Arrays;

public class IntArrayList implements IntList{
    private int size;
    private int[] array;


    //    CONSTRUCTOR PORQUE ESTO SIGUE SIENDO UNA CLASE
//    OJO que sí que se pueden determinar las variables dentro del constructor

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }
//    PROPIOS
//    llenar rápido por vaga

    public void llenar(){
        for (int i = 0; i < 9; i++) {
           add(i);
//           System.out.println("Este es el array resultante: " + array[i]);

        }
    }

    //DE LA INTERFAZ
    @Override
    public void add(int num) {
        if (size >= array.length ) {
            int newSize = array.length + array.length / 2;
            array = Arrays.copyOf(array,newSize);
        }
        array[size++]=num;

    }

//    @Override
//    public int get(int id) {
//
//        return id;
//    }

//    VISUALIZACIÓN PORQUE ESTO SIGUE SIENDO UNA CLASE
    @Override
    public String toString() {
        return "IntArrayList" + "\n" +
                "array: " + Arrays.toString(array);
    }
}
