package com.Interfaces;

public class IntArrayList implements IntList{

    private int size = 10;
    private int[] nou = new int[size];
    private int num = 0;

// CONSTRUCTOR
    public IntArrayList() {
    }

//    GETTERS&SETTERS
    public int[] getNou() {
        return nou;
    }

    public void setNou(int[] nou) {
        this.nou = nou;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

//MÉTHODS PROPIOS
public void llenar(){
    for (int i = 0; i < nou.length ; i++) {
        nou[i] = num++;
    }
}

public void checkArray(){
        if(num >= nou.length){
            int num2 = size + size / 2;

        }
}


//DE LA INTERFAZ
    @Override
    public void add() {
    llenar();
    }

    @Override
    public void get() {

    }
}
