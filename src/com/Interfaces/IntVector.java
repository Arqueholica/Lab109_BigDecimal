package com.Interfaces;

import java.util.Arrays;

public class IntVector implements IntList {
    private int[] array;
    private int size;

//    CONSTRUCTOR P
    public IntVector(){
        array = new int[20];
        size = 0;
    }

// PROPIOS
public void llenar(){
    for (int i = 0; i < 20; i++) {
        add(i);
//        System.out.println("Este es el array resultante: " + array[i]);

    }
}

    //DE LA INTERFAZ
    @Override
    public void add(int num) {
        if (size >= array.length){
            int newSize = array.length  * 2;
            array = Arrays.copyOf(array,newSize );
        }
        array[size++] = num;

    }
//    @Override
//    public int get(int id) {
//        if(id < 0 || id >=size)
//
//
//        return id;
//    }


//    VISUALIZACIÓN
    @Override
    public String toString() {
        return "IntVector" + "\n" +
                "array: " + Arrays.toString(array);
    }
}
